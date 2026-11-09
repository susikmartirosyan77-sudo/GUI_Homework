import java.util.Stack;

// Ստեղծում ենք BraceChecker դասը
public class BraceChecker {

    // Պահում ենք ստուգվող տեքստը
    private String text;

    // Կոնստրուկտոր
    public BraceChecker(String text) {
        this.text = text;
    }

    // Ստուգում ենք փակագծերի ճիշտ դասավորությունը
    public void check() {

        // Ստեղծում ենք Stack
        Stack<Character> stack = new Stack<>();

        // Անցնում ենք տեքստի բոլոր սիմվոլներով
        for (int i = 0; i < text.length(); i++) {

            // Ստանում ենք տվյալ դիրքի սիմվոլը
            char c = text.charAt(i);

            // Եթե բացվող փակագիծ է
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }

            // Եթե փակվող փակագիծ է
            else if (c == '}' || c == ']' || c == ')') {

                // Ստուգում ենք՝ Stack-ը դատարկ է
                if (stack.isEmpty()) {
                    System.out.println("Error: unexpected closing bracket " + c + " at " + i);
                    return;
                }

                // Նայում ենք վերջին բացվող փակագծին
                char opening = stack.peek();

                // Ստուգում ենք փակագծերի համապատասխանությունը
                if ((c == '}' && opening != '{') ||
                        (c == ']' && opening != '[') ||
                        (c == ')' && opening != '(')) {

                    System.out.println("Error: opened " + opening + " but closed " + c + " at " + i);
                    return;
                }

                // Հեռացնում ենք համապատասխան փակագիծը
                stack.pop();
            }
        }

        // Ստուգում ենք՝ չփակված բացվող փակագիծ մնացե՞լ է
        if (!stack.isEmpty()) {
            System.out.println("Error: unclosed opening bracket " + stack.peek());
            return;
        }

        // Եթե սխալներ չկան
        System.out.println("No errors");
    }
}
