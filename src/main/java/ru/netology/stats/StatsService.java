package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long resault = 0;
        for (long sale : sales) {
            resault = resault + sale;
        }
        return resault;
    }




    public long avg(long[] sales) {
        long sum = sum(sales);
        return sum / sales.length;
    }




    public long max(long[] sales) {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        int monthCounter = 0;
        int monthWithMax = 0;
        for (long sale : sales) {
            monthCounter++;
            if (sale == max) {
                monthWithMax = monthCounter;
            }
        }
        return monthWithMax;
    }




    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }



    public long BelowAvgSales(long[] sales) {
        long avg= avg(sales);
        int BelowAvg=0;
        for (long sale : sales){
            if (sale<avg){
                BelowAvg++;
            }
        }
        return BelowAvg;
    }





    public long AboveAvgSales(long[] sales) {
        long avg= avg(sales);
        int AboveAvg=0;
        for (long sale : sales){
            if (sale>avg){
                AboveAvg++;
            }
        }
        return AboveAvg;
    }

}

