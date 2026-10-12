
package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        // Task 1 — Տպել բոլոր տարրերը
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Task 2 — Տպել առաջին տարրը
        System.out.println(numbers[0]);

        // Task 3 — Տպել վերջին տարրը
        System.out.println(numbers[numbers.length - 1]);

        // Task 4 — Տպել զանգվածի երկարությունը
        System.out.println(numbers.length);

        // Task 5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum: " + min);

        // Task 6 — Տպել միջին տարրը կամ տարրերը
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 != 0) {
            System.out.println(numbers[numbers.length / 2]);
        } else {
            System.out.println(numbers[numbers.length / 2 - 1]);
            System.out.println(numbers[numbers.length / 2]);
        }

        // Task 7 — Հաշվել զույգ թվերը
        int even = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Even: " + even);

        // Task 8 — Հաշվել կենտ թվերը
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Odd: " + odd);

        // Task 9 — Գումարել բոլոր տարրերը
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        // Task 10 — Հաշվել միջին թվաբանականը
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);


        // Bonus 1 — Գտնել ամենամեծ թիվը
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum: " + max);

        // Bonus 2 — Հաշվել դրական, բացասական թվերը և զրոները
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);

        // Bonus 3 — Տպել հակառակ հերթականությամբ
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
