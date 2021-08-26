package pro.sky.java.course1;

public class HomeWork2 {
    public static void main(String[] args) {
        // 7 Задание сделаю сам позже, не хватило времени (((
        System.out.println("------------ Задание 6 ------------");
        Ex6();
        System.out.println("------------ Задание 5 ------------");
        Ex5();
        System.out.println("------------ Задание 4 ------------");
        Ex4();
        System.out.println("------------ Задание 3 ------------");
        Ex3();
        System.out.println("------------ Задание 2 ------------");
        Ex2();
        System.out.println("------------ Задание 1 ------------");
        Ex1();
    }

    private static void Ex1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    private static void Ex2() {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientOS == 1 && clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS == 0 && clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            }
        }
    }

    private static void Ex3() {
        int year = 2100;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год высокостный");
        } else {
            System.out.println("год не высокосный");
        }
    }

    private static void Ex4() {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 24 часа");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Доставка займет 48 часов");
            } else {
                System.out.println("Доставка займет до трех дней");
            }
        }
    }

    private static void Ex5() {
        int monthNumber = 78;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("не корректно введен месяц =)");
                break;
        }
    }

    private static void Ex6() {
        int age = 20;
        int salary = 30000;
        if (age >= 23 && salary < 50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей");
        } else if (age >= 23 && salary >= 50000 && salary <= 80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.2 + " рублей");
        } else if (age >= 23 && salary > 80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.5 + " рублей");
        } else if (age < 23 && salary < 50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 + " рублей");
        } else if (age < 23 && salary >= 50000 && salary <= 80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.2 + " рублей");
        } else if (age < 23 && salary > 80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.5 + " рублей");
        }
    }
}