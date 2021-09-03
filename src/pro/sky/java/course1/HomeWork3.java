package pro.sky.java.course1;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("----------- Задание 1 -----------");
        ex1();
        System.out.println("----------- Задание 2 -----------");
        ex2();
        System.out.println("----------- Задание 3 -----------");
        ex3();
        System.out.println("----------- Задание 4 -----------");
        ex4();
        System.out.println("----------- Задание 5 -----------");
        ex5();
    }

    private static void ex5() {
        int x = 0;
        int y = 1;
        do {
            System.out.println(x);
            y = x + y;
            if (y < 100) {
                System.out.println(y);
            }
            x = x + y;
        } while (x < 100);

        // int fibonacci = 1;
        // int a = 0;
        // int b = 0;
        //     do {
        //      a = b;
        //      b = fibonacci;
        //     fibonacci = a + b;
        //            System.out.println(fibonacci);
        //     } while (fibonacci < 100);
        // Сначала сделал а потом понял, что значение 0 не работает... а удалять жалко))
    }

    private static void ex4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else {
                System.out.println(i + ":");
            }
        }
    }

    private static void ex3() {
        int year = 2021;
        int previousYears = year - 200;
        int futureYears = year + 100;
        do {
            year += 79;
            System.out.println(year);
        } while (year > futureYears);
        do {
            year -= 79;
            System.out.println(year);
        } while (year > previousYears);
    }

    private static void ex2() {
        int reportDay = 4;
        while (reportDay <= 31) {
            System.out.println("Сегодня пятница, " + reportDay + "-ое число. Необходимо подготовить отчет");
            reportDay += 7;
        }
        // int reportDay = 5;
        // for (int i = reportDay; i <= 31; i += 7) {
        //      System.out.println("Сегодня пятница, " + i + "-ое число. Необходимо подготовить отчет");
        //  }
    }

    private static void ex1() {
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}



