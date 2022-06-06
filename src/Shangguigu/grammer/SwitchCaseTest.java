package Shangguigu.grammer;

import java.util.Scanner;

/**
 * switch 表达式的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应的case结构中，调用其执行语句
 * 当调用完执行语句后，依然向下执行，直到遇到break（遇到break就跳出）或执行到结构末尾为止
 * switch结构中的表达式，只能是如下的6种数据类型之一：
 * byte\short\char\int\枚举类型\String类型
 *
 * 说明：
 * 当可以选择使用switch-case时，优先选用，执行效率更高
 */

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        // test 1:
//        int number = input.nextInt();
//        switch (number) {
//            case 0:
//                System.out.println("zero");
//                break;
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            default:
//                System.out.println("other");
//        }

//        // test 2:判断分数是否及格
//        int score = input.nextInt();
//        switch (score/10){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("不及格");
//                break;
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("及格");
//                break;
//        }

        // 输入x年的x年x月，输出为x年的第x天
        // 判断一年是否是闰年的标准：
        // （1）可以被4整除，但不可被100整除；（2）可以被400整除
        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月份：");
        int month = input.nextInt();
        System.out.println("请输入日期：");
        int day = input.nextInt();
        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 30;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;
        }
        System.out.println(year+"年"+month+"月"+day+"日是当年的"+sumDays+"天");


    }
}
