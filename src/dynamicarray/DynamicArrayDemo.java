package homework.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        // Ստեղծում ենք DynamicArray օբյեկտ
        DynamicArray da = new DynamicArray();

        // Թեստ 1 — Ավելացնում ենք 5 էլեմենտ
        System.out.println("Test 1: 5 elements");

        for (int i = 1; i <= 5; i++) {
            da.add(i * 10);
        }

        da.print();

        // Թեստ 2 — Ավելացնում ենք մինչև 15 էլեմենտ
        System.out.println("Test 2: 15 elements");

        for (int i = 6; i <= 15; i++) {
            da.add(i * 10);
        }

        da.print();

        // Թեստ 3 — Ավելացնում ենք մինչև 25 էլեմենտ
        System.out.println("Test 3: 25 elements");

        for (int i = 16; i <= 25; i++) {
            da.add(i * 10);
        }

        da.print();

        // Թեստ 4 — Ստուգում ենք getByIndex մեթոդը
        System.out.println("Test 4: getByIndex");

        // Ստուգում ենք առաջին էլեմենտը
        System.out.println("First element: " + da.getByIndex(0));

        // Ստուգում ենք վերջին էլեմենտը
        System.out.println("Last element: " + da.getByIndex(24));

        // Ստուգում ենք բացասական ինդեքսը
        System.out.println("Negative index: " + da.getByIndex(-1));

        // Ստուգում ենք գոյություն չունեցող ինդեքսը
        System.out.println("Non-existing index: " + da.getByIndex(25));

        // Ստեղծում ենք դատարկ զանգված
        DynamicArray empty = new DynamicArray();

        // Ստուգում ենք դատարկ զանգվածի ինդեքսը
        System.out.println("Empty array: " + empty.getByIndex(0));
    }
}
