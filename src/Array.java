public class Array {
    private int[] array;

    public Array(int length) {
        array = new int[length];
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void fill() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) * (int) (Math.random() * 10);
        }
    }

    public int[] getArray() {
        return array;
    }

}
