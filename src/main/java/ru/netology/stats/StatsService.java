package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;

    }

    public long averageSales(long[] sales) {
        int sum = 0;
        int averageSales = 0;
        for (long sale : sales) {
            sum += sale;
            averageSales = sum / 12;

        }
        return averageSales;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long countBelowAverageSales(long[] sales) {
        int sum = 0;
        int averageSales = 0;
        int count = 0;
        for (long sale : sales) {
            sum += sale;
            averageSales = sum / 12;
        }
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public long countAboveAverageSales(long[] sales) {
        int sum = 0;
        int averageSales = 0;
        int count = 0;
        for (long sale : sales) {
            sum += sale;
            averageSales = sum / 12;
        }
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }

}