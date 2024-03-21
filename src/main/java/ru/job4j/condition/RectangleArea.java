package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result);
    }
}

//        h = p / (2 * (k + 1));
//        l = h * k;
//        s = l * h;
//Допишите метод square, используя три формулы для h, l и s.
//Доработайте метод main с демонстрацией работы программы
// с параметрами p = 6, k = 2, площадь должна быть 2.