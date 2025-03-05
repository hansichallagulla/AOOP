public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
    private T[] values;

    public MinMaxImpl(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T min = values[0];
        for (T value : values) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = values[0];
        for (T value : values) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }
}
