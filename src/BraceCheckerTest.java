

public class BraceCheckerTest {

    public static void main(String[] args) {

        // Ճիշտ փակագծերի թեստեր
        BraceChecker bc1 = new BraceChecker("Hello from [Java]");
        bc1.check();

        BraceChecker bc2 = new BraceChecker("{Hello (Java)}");
        bc2.check();

        BraceChecker bc3 = new BraceChecker("{[()]}");
        bc3.check();

        BraceChecker bc4 = new BraceChecker("Hello Java");
        bc4.check();

        BraceChecker bc5 = new BraceChecker("((()))");
        bc5.check();

        // Սխալ փակագծերի թեստեր
        BraceChecker bc6 = new BraceChecker("Hello from [Java)");
        bc6.check();

        BraceChecker bc7 = new BraceChecker("{[(])}");
        bc7.check();

        BraceChecker bc8 = new BraceChecker("Hello from Java]");
        bc8.check();

        BraceChecker bc9 = new BraceChecker("{Hello Java");
        bc9.check();

        BraceChecker bc10 = new BraceChecker("(()");
        bc10.check();
    }
}
