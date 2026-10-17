package homework;



    public class ArrayHomework {
        public static void main(String[] args) {

            // Task 1:
            int[] numbers1 = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
            int n = 6;
            int count = 0;

            for (int i = 0; i < numbers1.length; i++) {
                if (numbers1[i] == n) {
                    count++;
                }
            }

            System.out.println("Count of " + n + ": " + count);


            // Task 2:
            int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};

            for (int i = 0; i < numbers2.length / 2; i++) {
                int temp = numbers2[i];
                numbers2[i] = numbers2[numbers2.length - 1 - i];
                numbers2[numbers2.length - 1 - i] = temp;
            }

            System.out.print("Reversed array: ");
            for (int i = 0; i < numbers2.length; i++) {
                System.out.print(numbers2[i] + " ");
            }
            System.out.println();


            // Task 3:
            int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
            int repeatedCount = 0;

            for (int i = 0; i < numbers3.length; i++) {
                boolean appearedEarlier = false;

                for (int j = 0; j < i; j++) {
                    if (numbers3[j] == numbers3[i]) {
                        appearedEarlier = true;
                        break;
                    }
                }

                if (!appearedEarlier) {
                    boolean appearsAgain = false;

                    for (int j = i + 1; j < numbers3.length; j++) {
                        if (numbers3[j] == numbers3[i]) {
                            appearsAgain = true;
                            break;
                        }
                    }

                    if (appearsAgain) {
                        repeatedCount++;
                    }
                }
            }

            System.out.println("Repeated numbers count: " + repeatedCount);


            // Task 4:
            char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
            int vowelsCount = 0;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'ա' || chars[i] == 'ե' || chars[i] == 'է'
                        || chars[i] == 'ը' || chars[i] == 'ի'
                        || chars[i] == 'ո' || chars[i] == 'օ') {
                    vowelsCount++;
                }
            }

            System.out.println("Vowels count: " + vowelsCount);


            // Bonus 1:
            int[] numbers5 = {12, 5, 8, 20, 3, 15};
            int max = numbers5[0];
            int secondMax = Integer.MIN_VALUE;

            for (int i = 1; i < numbers5.length; i++) {
                if (numbers5[i] > max) {
                    secondMax = max;
                    max = numbers5[i];
                } else if (numbers5[i] < max && numbers5[i] > secondMax) {
                    secondMax = numbers5[i];
                }
            }

            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("Second largest: does not exist");
            } else {
                System.out.println("Second largest: " + secondMax);
            }


            // Bonus 2:
            int[] numbers6 = {3, 6, 3, 8, 6, 9, 8};

            System.out.print("Distinct numbers: ");

            for (int i = 0; i < numbers6.length; i++) {
                boolean appearedEarlier = false;

                for (int j = 0; j < i; j++) {
                    if (numbers6[j] == numbers6[i]) {
                        appearedEarlier = true;
                        break;
                    }
                }

                if (!appearedEarlier) {
                    System.out.print(numbers6[i] + " ");
                }
            }

            System.out.println();
        }
    }


