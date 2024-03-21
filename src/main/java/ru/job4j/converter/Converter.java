package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float ruble = 420;
        float expectedEuro = 6;
        float expectedDollar = 7;
        float outputEuro = rubleToEuro(ruble);
        float outputDollar = rubleToDollar(ruble);
        boolean passedEuro = expectedEuro == outputEuro;
        boolean passedDollar = expectedDollar == outputDollar;

        System.out.println(ruble + " rubles are " + expectedEuro + " euro. Test result : " + passedEuro);
        System.out.println(ruble + " rubles are " + expectedDollar + " dollar. Test result : " + passedDollar);
    }
}