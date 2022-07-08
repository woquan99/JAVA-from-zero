package OJtest.week11;

import java.util.Scanner;

/**
 * 题目来源：https://matiji.net/exam/dohomework/1081/3
 * Bob作为超级反派，它有M（M为正整数）的血量，Alice作为超级英雄有n种攻击技能。
 * Alice想要在最后一波攻击将自己的所有伤害全部输出，他想知道能否打空Bob的血槽（M<=0），从而击败Bob。如果能击败Bob，则输出Yes，否则输出No
 * 输入格式：
 * 第一行输入Bob血量M，Alice的攻击技能种数n
 * 第二行输入n个整数A
 * 输出格式：
 * 输出Yes或者No
 *
 */


public class test3 {
    public static void main(String[] args){
        int sum=0;
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        if(sum>=M){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
