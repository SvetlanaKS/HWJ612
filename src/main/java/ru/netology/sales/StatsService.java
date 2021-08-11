package ru.netology.sales;

public class StatsService {

    public int minSales(int[] sales) {

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

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int SumSales(int[] sales) {
        int sum = 0;
        for (int x : sales) {

            sum = sum + x;

        }
        System.out.println(sum);
        return sum;
    }

    public int AverageSales(int[] sales) {
        int averageSale = 0;
        for (int x : sales) {
            averageSale = (averageSale + x);
        }
        System.out.println(averageSale / sales.length);
        return averageSale / sales.length;
    }

    public int NumberMonthLessAverageSales(int[] sales) {
        StatsService serviceAverage = new StatsService();
        int Average = serviceAverage.AverageSales(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale < Average) {
                counter++;
            }
        }
        System.out.println(counter);

        return counter;
    }

    public int NumberMonthOverAverageSales(int[] sales) {
        StatsService serviceAverage = new StatsService();
        int Average = serviceAverage.AverageSales(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale > Average) {
                counter++;
            }
        }

        System.out.println(counter);

        return counter;
    }
}
