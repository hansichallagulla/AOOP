import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie other) {
        // Primary sort by year (ascending)
        int yearComparison = Integer.compare(this.year, other.year);
        if (yearComparison != 0) {
            return yearComparison;
        }

        // Secondary sort by rating (descending) if years are the same
        return Double.compare(other.rating, this.rating);  // Note the reverse order for descending
    }


    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

public class MovieSorter {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(8.5, "Oppenheimer", 2023));
        movies.add(new Movie(7.9, "Barbie", 2023));
        movies.add(new Movie(9.2, "The Shawshank Redemption", 1994));
        movies.add(new Movie(8.8, "Interstellar", 2014));
        movies.add(new Movie(8.3, "The Dark Knight", 2008));
        movies.add(new Movie(9.5, "New Movie", 1994)); //Example to test same year, different rating

        System.out.println("Unsorted Movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies); // Sorts using the compareTo method

        System.out.println("\nSorted Movies by Year (then Rating):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}