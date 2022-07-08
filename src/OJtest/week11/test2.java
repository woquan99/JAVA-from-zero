package OJtest.week11;

import java.util.Scanner;

/**
 * 题目来源：https://matiji.net/exam/dohomework/1081/2
 * Lucas定理
 * 给定整数n,m,p，计算C(n+m,n) mod p的值。
 * 输入格式：一行包含三个整数 n,m,p
 * 输出格式：一行包含一个整数C(n+m,m) mod p
 *
 *
 */

public class test2 {
    public static void main(String[] args){
        int sum1=1;
        int sum2=1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int p = input.nextInt();
        for(int i= 1;i<=m;i++){
            sum1 = sum1*(n+i);
            sum2 = sum2*i;
        }
        System.out.print((sum1/sum2)%p);

    }
}
