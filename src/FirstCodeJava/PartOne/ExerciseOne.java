package FirstCodeJava.PartOne;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args){
        // P68 五.编程题第三问
        Scanner in = new Scanner(System.in);
        int TestNum = in.nextInt();
        if(TestNum%3 == 0 && TestNum%5 == 0 && TestNum%7 == 0){
            System.out.println("这个数字可以被3、5、7同时整除");
        }else
            System.out.println("这个数字不可以被3、5、7同时整除");

        //  P68 五.编程题第四问
        int sum = 0;
        for(int i = 100;i<=200;i++){
            sum += i;
        }
        System.out.println("100——200的整数和为"+sum+"\n");

        int sum1 = 0;
        int a = 100;
        do{
            sum1 += a;
            a++;
        }while (a<=200);
        System.out.println("100——200的整数和为"+sum1+"\n");


    }

}
