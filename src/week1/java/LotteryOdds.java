package week1.java;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest numbers you can draw?");
        int n = in.nextInt();
//从n个数字中抽取k个数字的运行代码
        int lotteryOdds =1 ;
        for(int i =1;i<=k;i++)
            lotteryOdds=lotteryOdds*(n-i+1)/i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ".Good luck ! ");
//       包含 4个选项的菜单系统，可以使用下列代码
//        Scanner in1 = new Scanner(System.in);
//        System.out.print("Select an option (1, 2, 3, 4)" );
//        int choice = in1.nextInt();
//        switch (choice)
//        {
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            default:
//// bad input
//                break;
//        }


    }
}
