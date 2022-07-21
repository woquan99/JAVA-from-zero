package OJtest.week13;

import java.util.Scanner;

/**
 * 给定x.y.k，求x/y在k进制下是否为纯循环小数，当x/y为整数时我们也当作纯循环小数
 * 判断循环小数：https://blog.csdn.net/zqz19891031/article/details/6785984
 */
public class test1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int k = input.nextInt();
        System.out.println("YES");

    }
}
