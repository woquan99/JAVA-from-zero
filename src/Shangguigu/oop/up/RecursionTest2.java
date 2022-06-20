package Shangguigu.oop.up;

import java.util.Scanner;

/**
 * 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
 * 1  1  2  3  5  8  13  21  34  55
 * 规律：一个数等于前两个数之和
 * 要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        System.out.println("请输入斐波那契数列的第n个值");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        RecursionTest2 test = new RecursionTest2();
        System.out.println(test.f(a));
    }

    public int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
