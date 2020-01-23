public class SelectionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        int min;

        for (int out = 0; out < array.length - 1; out++) {
            min = out;
            for (int in = out + 1; in < array.length; in++) {
                if (array[in] < array[min]) min = in;
            }
            int temp = array[out];
            array[out] = array[min];
            array[min] = temp;
        }
    }
}
