// Calendar Test

package week2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondSample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();// 构造好的对象保存在一个变量中
        LocalDate date  = date1.plusDays(30);// 以30天以后为时间基准
        int year  = date.getYear();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // Set to start of month,当前日期之后或者之前n天的日期
        DayOfWeek weekday = date.getDayOfWeek(); // Get the current day of the week
        int value = weekday.getValue(); //1 = Monday, ... 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");// 第一行的缩进
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());// %3d表示空三个字符
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) // 新的一周第一天就换行
                System.out.println();
        }
//        if (date.getDayOfWeek().getValue() != 1)
//            System.out.println();


//        LocalDate aThousandDaysLater = newYearEve.plusDays(1000);// 距离现在1000天以后的时间
//        int year = aThousandDaysLater.getYear();//
//        int month = aThousandDaysLater.getMonthValue(); // 09
//        int day = aThousandDaysLater.getDayOfMonth(); // 2
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);
    }
}

