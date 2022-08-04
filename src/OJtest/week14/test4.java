package OJtest.week14;

import java.util.Scanner;

/**
 * 从中取出个球的得分是小码哥取出k个球的所可能性的平方
 * 组合C
 */

public class test4 {
    public static int f(int n,int m)//定义n个球中取m个球,组合求解
    {
        if(n<m)
            return 0;//如果n小于m，则不存在
        if(n==m)
            return 1;        //只有一种取法
        if(m==0)
            return 1;             //只有一种取法
        return f(n-1,m-1)+f(n-1,m);//有一个球设置为特殊球x，所有取法分成两部分，划分标准
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Long sum =0l;
        for(int m=1;m<=n;m++){
            int k= f(n,m);
            sum += (k*k);

        }
        System.out.print(sum);
    }
}
