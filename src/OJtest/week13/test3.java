package OJtest.week13;

import java.util.Scanner;

/**
 * 小码哥有n幅画，每幅画都有一个编号ai；，编号为非负数且可以相同。他想改变一些画的编号，使得n幅画使用的不同编号数量不超过k，
 * 问最少需要改变多少幅画的编号？
 */
public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[]{};
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

    }
}
