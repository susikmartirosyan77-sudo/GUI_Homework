
package homework;

public class ArraySortingHomework {

    public static void main(String[] args) {

        // Խնդիր 1․ Աճման կարգով՝ փոքրից մեծ
        int[] numbers1 = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {

                if (numbers1[i] > numbers1[j]) {
                    int temp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = temp;
                }
            }
        }

        System.out.println("Ascending order:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }

        System.out.println();

        // Խնդիր 2․ Նվազման կարգով՝ մեծից փոքր
        int[] numbers2 = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = i + 1; j < numbers2.length; j++) {

                if (numbers2[i] < numbers2[j]) {
                    int temp = numbers2[i];
                    numbers2[i] = numbers2[j];
                    numbers2[j] = temp;
                }
            }
        }

        System.out.println("Descending order:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }

        System.out.println();
    }
}
