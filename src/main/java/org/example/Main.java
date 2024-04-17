package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        int i = 1212414;
        byte b = 122;
        short s =1412;
        long l =12311;
        float f =1.23f;
        double d =234.6;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d типом double равно " + d);

        // Task two
        float flo = 27.12f;
        long lo = 987678965549L;
        double dou = 2.786;
        int in = 569;
        short sh = -159;
        short sh2 = 27897;
        byte by = 67;

        // Task tree
        int teacherOne = 23;
        int teacherTwo = 27;
        int teacherThree = 30;
        int paperAmount = 480;
        double paperPerStudent = paperAmount / (teacherOne + teacherTwo + teacherThree);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // Task four
        int countOfBottles = 16;
        int minutes = 2;
        int bottlesPerMinute = countOfBottles / minutes;
        int newTime = 20;
        int newCountOfBottles = newTime * bottlesPerMinute;
        System.out.println("За 20 минут машина произвела " + newCountOfBottles + " штук бутылок");
        newTime = 24 * 60;
        newCountOfBottles = newTime * bottlesPerMinute;
        System.out.println("За сутки машина произвела " + newCountOfBottles + " штук бутылок");
        newTime = newTime * 3;
        newCountOfBottles = newTime * bottlesPerMinute;
        System.out.println("За трое суток машина произвела " + newCountOfBottles + " штук бутылок");
        newTime = newTime * 10;
        newCountOfBottles = newTime * bottlesPerMinute;
        System.out.println("За месяц машина произвела " + newCountOfBottles + " штук бутылок");

        // Task five
        int paintCanAmount = 120;
        int whitePaintCanPerClass = 2;
        int brownPaintCanPerClass = 4;
        float totalAmountOfPaintCansPerClass = whitePaintCanPerClass+brownPaintCanPerClass;
        float countOfClasses = paintCanAmount/totalAmountOfPaintCansPerClass;
        float totalAmountOfWhitePaintCans = whitePaintCanPerClass*countOfClasses;
        float totalAmountOfBrownPaintCans = brownPaintCanPerClass*countOfClasses;
        System.out.println("В школе, где " + countOfClasses + " классов, нужно " + totalAmountOfWhitePaintCans + " банок белой краски и " + totalAmountOfBrownPaintCans + " банок коричневой краски");

        // Task six
        int amountOfBananas = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        float milkWeightPer100 = 105;
        float milkWeightPer1 = milkWeightPer100 / 100;
        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int eggsAmount = 4;
        int eggWeight = 70;
        float totalWeightOfBreakfastInGram = amountOfBananas * bananaWeight
                + milkVolume * milkWeightPer1
                + iceCreamAmount * iceCreamWeight
                + eggsAmount * eggWeight;
        float totalWeightOfBreakfastInKilogram = totalWeightOfBreakfastInGram/1000;
        System.out.println("Вес спортзавтрака в граммах - " + totalWeightOfBreakfastInGram);
        System.out.println("Вес спортзавтрака в килограммах - " + totalWeightOfBreakfastInKilogram);

        // Task seven
        int weightToLoseInKilogram = 7;
        int gramInKilogram = 1000;
        int weightToLoseInGram = weightToLoseInKilogram * gramInKilogram;
        int lowerLineOfPossibleWeightToLose = 250;
        int topLineOfPossibleWeightToLose = 500;
        float amountOfDaysWithLowerLine = weightToLoseInGram/lowerLineOfPossibleWeightToLose;
        float amountOfDaysWithTopLine = weightToLoseInGram/topLineOfPossibleWeightToLose;
        float averageAmountOfDays = (amountOfDaysWithTopLine + amountOfDaysWithLowerLine)/2;
        System.out.println("Наибольшее количество дней - " + amountOfDaysWithLowerLine + " дней");
        System.out.println("Наименьшее количество дней - " + amountOfDaysWithTopLine + " дней");
        System.out.println("Среднее количество дней - " + averageAmountOfDays + " дней");

        // Task eight
        int mashaBefore = 67760;
        int denisBefore = 83690;
        int kristinaBefore = 76230;
        float bonusPercentage = 0.1f;
        float mashaAfter = mashaBefore + mashaBefore*bonusPercentage;
        float denisAfter = denisBefore + denisBefore*bonusPercentage;
        float kristinaAfter = kristinaBefore + kristinaBefore*bonusPercentage;
        int monthsInYear = 12;
        float mashaYearIncomeBefore = mashaBefore * monthsInYear;
        float denisYearIncomeBefore = denisBefore * monthsInYear;
        float kristinaYearIncomeBefore = kristinaBefore * monthsInYear;
        float mashaYearIncomeAfter = mashaAfter * monthsInYear;
        float denisYearIncomeAfter = denisAfter * monthsInYear;
        float kristinaYearIncomeAfter = kristinaAfter * monthsInYear;
        float mashaIncomeDif = mashaYearIncomeAfter - mashaYearIncomeBefore;
        float denisIncomeDif = denisYearIncomeAfter - denisYearIncomeBefore;
        float kristinaIncomeDif = kristinaYearIncomeAfter - kristinaYearIncomeBefore;

        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaIncomeDif + " рублей");
        System.out.println("Маша теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisIncomeDif + " рублей");
        System.out.println("Маша теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + kristinaIncomeDif + " рублей");

    }
}