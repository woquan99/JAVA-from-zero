package OJtest.yinhang;

import java.util.Scanner;

/**
 * num为一个三位数，现在将其分解为3个素数的和，请问有多少种不同的分解方法
 * 奇数=三个素数之和；
 * 偶数=2+两个素数之和。
 */


public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        int i, j;
        int times = 0;
        int Index = 0;

        // num以内的所有素数都找出来
        for (i = 2; i < num; i++) {
            for (j = 2; j < i; j++)
                if (i % j == 0)
                    break;
            if (j == i) {
                arr[Index] = i;
                Index++;
            } else
                continue;
        }
        // 偶数情况
        if (num % 2 == 0) {
            for (int m = 0; m < Index; m++) {
                for (int n = 0; n < Index; n++) {
                    if ((num - 2) == arr[n] + arr[m]) {
                        times++;
//                        System.out.println(arr[m] + " " + arr[n]);
                    }
                }
            }
            System.out.println(times / 2);
        }
        // 奇数情况
        else {
            for (int l = 0; l < Index; l++) {
                for (int m = 0; m <=l; m++) {
                    for (int n = 0; n <=m; n++) {
                            if (num == (arr[l] + arr[m] + arr[n])) {
                                times++;
//                                System.out.println(arr[l] + " " + arr[m] + " " + arr[n]);
                            }
                        }
                    }
            }
            System.out.println(times);
        }
    }
}