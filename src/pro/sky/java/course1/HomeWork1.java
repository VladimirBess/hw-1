package pro.sky.java.course1;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("===================== Задача 1 =======================");
        exercise1();
        System.out.println("===================== Задача 2 =======================");
        exercise2();
        System.out.println("===================== Задача 3 =======================");
        exercise3();
        System.out.println("===================== Задача 4 =======================");
        exercise4();
        System.out.println("===================== Задача 5 =======================");
        exercise5();
        System.out.println("===================== Задача 6 =======================");
        exercise6();
        System.out.println("===================== Задача 7 =======================");
        exercise7();
        System.out.println("===================== Задача 8 =======================");
        exercise8();
    }

    private static void exercise1() {
        byte b = 121;
        short s = -31232;
        int i = 2036656656;
        long l = 6656655596564L;
        float f = -65.5f;
        double d = 6956.5565656;
        char c = 1655;
        System.out.println("Перечисление всех типов переменных: " + " B=" + b + ", S=" + s + ", I=" + i + ", L=" + l + ", F=" + f + ", D=" + d + ", C=" + c);
    }

    private static void exercise2() {
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов: " + totalBoxerWeight + "Кг");
        float weightDifferenceBoxer = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница веса Боксеров: " + weightDifferenceBoxer + "Кг");
    }

    private static void exercise3() {
        double kg = 1000;
        byte volume = 100;
        byte bananaPieces = 5;
        byte bananaWeight = 80;
        double bananaKgWeight = bananaWeight  / kg;
        double bananaTotalWeight = bananaPieces * bananaKgWeight;
        System.out.println("Вес бананов: " + bananaTotalWeight + "Кг");
        short milkVolume = 200;
        byte milkWeight = 105;
        int milkGlWeight = milkWeight * milkVolume / volume;
        double milkTotalWeight = milkGlWeight / kg;
        System.out.println("Вес молока: " + milkTotalWeight + "Kг");
        byte iceCrPack = 2;
        float iceCrPackWeight = iceCrPack * volume;
        double iceCrPackTotalWeight = iceCrPackWeight / kg;
        System.out.println("Вес Мороженого:" + iceCrPackTotalWeight + "Кг");
        byte rawEgg = 4;
        byte rawEggWeight = 70;
        double rawEggKgWeight = rawEggWeight / kg;
        double rawEggTotalWeight = rawEgg * rawEggKgWeight;
        System.out.println("Вес Сырого яйца: " + rawEggTotalWeight + "Кг");
        double totalWeight = bananaTotalWeight + milkTotalWeight + iceCrPackTotalWeight + rawEggTotalWeight;
        System.out.println("______Общий вес завтрака: " + totalWeight + "Кг______");
    }

    private static void exercise4() {
        short kg = 1000;
        byte target = 7;
        short firstDiet = 250;
        int needToDropInGrams = target * kg;
        int firstCalculDiet = needToDropInGrams / firstDiet;
        System.out.println("При потере 250 грамм понадобиться " + firstCalculDiet + " дней");
        short secondDiet = 500;
        int secondCalculDiet = needToDropInGrams / secondDiet;
        System.out.println("При потере 500 грамм понадобится " + secondCalculDiet + " дней");
        System.out.println("В среднем понадобится  " + (firstCalculDiet + secondCalculDiet) / 2 + " день" );
    }

    private static void exercise5() {
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int percent = 10;
        double percentUp = (percent * 0.01);
        double mashaUp = masha * percentUp + masha;
        double denisUp = denis * percentUp + denis;
        double kristinaUp = kristina * percentUp + kristina;
        double mashaTotal = (mashaUp - masha) * 12;
        double denisTotal = (denisUp - denis) * 12;
        double kristinaTotal = (kristinaUp - kristina) * 12;
        System.out.println("Маша теперь получает " + mashaUp + " рублей. Годовой доход вырос на " + mashaTotal + " рублей.");
        System.out.println("Маша теперь получает " + denisUp + " рублей. Годовой доход вырос на " + denisTotal + " рублей.");
        System.out.println("Маша теперь получает " + kristinaUp + " рублей. Годовой доход вырос на " + kristinaTotal + " рублей.");
    }

    private static void exercise6() {
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = a * (b + (c - d * e));
        //int invertResult = result - result * 2;
        int invertResult = -result;
        System.out.println("Результат: " + result);
        System.out.println("Инвертированый результат: " + invertResult);
    }

    private static void exercise7() {
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a=" + a + " b=" + b);
    }

    private static void exercise8() {
        short a = 546;
        int b = ((a / 10) % 10);
        System.out.println("Число по центру: " + b);
    }


}




