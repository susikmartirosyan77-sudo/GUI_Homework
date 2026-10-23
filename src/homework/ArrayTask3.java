
package homework;

public class ArrayTask3 {
    public static void main(String[] args) {

        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

        // Problem 1
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        // Problem 2
        System.out.println("Length: " + chars.length);
        System.out.println("First: " + chars[0]);
        System.out.println("Last: " + chars[chars.length - 1]);

        // Problem 3k
        char target = 'a';
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);

        // Problem 4
        count = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == 'a' || c == 'A' ||
                    c == 'e' || c == 'E' ||
                    c == 'i' || c == 'I' ||
                    c == 'o' || c == 'O' ||
                    c == 'u' || c == 'U') {
                count++;
            }
        }
        System.out.println("Vowels: " + count);

        // Problem 5
        count = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if ((c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z')) {

                if (c != 'a' && c != 'A' &&
                        c != 'e' && c != 'E' &&
                        c != 'i' && c != 'I' &&
                        c != 'o' && c != 'O' &&
                        c != 'u' && c != 'U') {
                    count++;
                }
            }
        }
        System.out.println("Consonants: " + count);

        // Problem 6
        count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        System.out.println("Spaces: " + count);

        // Problem 7
        char[] reversed = chars.clone();

        for (int i = 0; i < reversed.length / 2; i++) {
            int j = reversed.length - 1 - i;

            char temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
        }

        System.out.print("Reversed: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

        // Problem 8
        char[] upperChars = chars.clone();

        for (int i = 0; i < upperChars.length; i++) {
            if (upperChars[i] >= 'a' && upperChars[i] <= 'z') {
                upperChars[i] = (char) (upperChars[i] - 32);
            }
        }

        System.out.print("Uppercase: ");
        for (int i = 0; i < upperChars.length; i++) {
            System.out.print(upperChars[i]);
        }
        System.out.println();

        // Problem 8
        char[] lowerChars = chars.clone();

        for (int i = 0; i < lowerChars.length; i++) {
            if (lowerChars[i] >= 'A' && lowerChars[i] <= 'Z') {
                lowerChars[i] = (char) (lowerChars[i] + 32);
            }
        }

        System.out.print("Lowercase: ");
        for (int i = 0; i < lowerChars.length; i++) {
            System.out.print(lowerChars[i]);
        }
        System.out.println();

        // Problem 9
        char[] replaced = chars.clone();

        for (int i = 0; i < replaced.length; i++) {
            if (replaced[i] == 'a') {
                replaced[i] = '*';
            }
        }

        System.out.print("Replaced: ");
        for (int i = 0; i < replaced.length; i++) {
            System.out.print(replaced[i]);
        }
        System.out.println();

        // Problem 10
        boolean isPalindrome = true;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome: " + isPalindrome);

        // Bonus 1
        char searchChar = 'a';
        int index = -1;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == searchChar) {
                index = i;
                break;
            }
        }
        System.out.println("First index: " + index);

        // Bonus 2
        char[] firstArray = {'J', 'a', 'v', 'a'};
        char[] secondArray = {'J', 'a', 'v', 'a'};

        boolean equal = true;

        if (firstArray.length != secondArray.length) {
            equal = false;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println("Arrays equal: " + equal);

        // Bonus 3
        System.out.print("Unique chars: ");

        for (int i = 0; i < chars.length; i++) {
            boolean alreadyPrinted = false;

            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.print(chars[i]);
            }
        }
        System.out.println();
    }
}
