package ru.mephi.java.chapter01.lab01.ex16;

// Усовершенствуйте упоминавшийся ранее метод average () таким образом,
// чтобы он вызывался хотя бы с одним параметром.

public class Class16 {
    public static void main(String[] args) {
        System.out.printf("\nСреднее ранее упоминавшимся average() - %g\n", average(1.1, 3.3, 5.5, 7.7, 9.9));
        System.out.printf("Среднее улучшенным averageExtended() - %g\n", averageExtended(1.1, 3.3, 5.5, 7.7, 9.9));
        System.out.println("\nЗадание выполнено!");
    }

    public static double average(double... values) {
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return values.length == 0 ? 0 : sum / values.length;
    }

    public static double averageExtended(double first, double... rest) {
        double sum = first;
        for (double v : rest) {
            sum += v;
        }
        return sum / (rest.length + 1);
    }

}
