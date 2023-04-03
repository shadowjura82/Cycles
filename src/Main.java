public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задание 7");
        for (int i = 1; i < 600; i *= 2) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task8() {
        int investitionValue = 29000;
        int summCount = 0;
        System.out.println("Задание 8");
        for (int i = 1; i < 13; i++) {
            summCount += investitionValue;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summCount + " рублей");
        }
        System.out.println();
    }

    public static void task9() {
        int investitionValue = 29000;
        int summCount = 0;
        System.out.println("Задание 9");
        for (int i = 1; i < 13; i++) {
            summCount += investitionValue + (summCount / 100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summCount + " рублей");
        }
        System.out.println();
    }
}