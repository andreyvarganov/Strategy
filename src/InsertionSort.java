public class InsertionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        int in, out, temp;
        for (out = 1; out < array.length; out++) {
            temp = array[out];
            in = out;
            //System.out.println(out + " - проход, метка " + temp);
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }
}
