import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private static SortStrategy sortStrategy;

    public static void main(String[] args) {

        int choiceNum = 0;
        Array array;
        long start, finish, result;

        System.out.print("Enter length: ");

        try (BufferedReader reader= new BufferedReader(new InputStreamReader(System.in))) {

            int length = Integer.parseInt(reader.readLine());
            array = new Array(length);

            if (sortStrategy == null) {
                System.out.print("Choose algorithm:\n" +
                        "1 - bubble sort;\n" +
                        "2 - selection sort;\n" +
                        "3 - insertion sort;\n" +
                        "Your choice: ");
                choiceNum = Integer.parseInt(reader.readLine());
            }

            switch (choiceNum) {
                case 1:
                    sortStrategy = new BubbleSort();
                    break;
                case 2:
                    sortStrategy = new SelectionSort();
                    break;
                case 3:
                    sortStrategy = new InsertionSort();
                    break;
            }

            array.fill();
            array.display();

            start = System.currentTimeMillis();
            sortStrategy.sort(array.getArray());
            finish = System.currentTimeMillis();

            array.display();

            System.out.println("Результат: " + (finish - start));

        } catch (IllegalArgumentException e) {
            System.out.println("Wrong! IllegalArgumentException!");
        } catch (IOException e) {
            System.out.println("Wrong! IOException!");
        }
    }
}
