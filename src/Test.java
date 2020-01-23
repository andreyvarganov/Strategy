import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private static SortStrategy sortStrategy;

    public static void main(String[] args) {

        char choiceYN = 'y';
        int choiceNum = 0;
        int[] array;

        do {

            System.out.print("Enter length: ");

            try (BufferedReader reader= new BufferedReader(new InputStreamReader(System.in))) {

                int length = Integer.parseInt(reader.readLine());
                array = new int[length];

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

                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();

                sortStrategy.sort(array);

                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();

                System.out.println("Do you want to repeat? Y/N");
                choiceYN = reader.readLine().charAt(0);

            } catch (IOException e) {
                System.out.println("Wrong!");
            }

        } while (choiceYN != 'n');
    }
}
