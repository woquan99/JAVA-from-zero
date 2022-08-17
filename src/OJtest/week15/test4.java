package OJtest.week15;

import java.util.Scanner;

/**
 * 输入两个正整数n和k，求与n互质的第k个正整数
 * C++解法就可以AC，但是JAVA就超时
 * 解法：https://www.cnblogs.com/-pwl/p/12287739.html
 */
public class test4 {
    // 计算两数的最大公因数
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0,a=0,i=1;
        int n = input.nextInt();
        int k = input.nextInt();
        while (sum!=k){
            if(gcd(n,i)==1){ // 众所周知，当两个数的最大公因数为1时，此两数互质
                sum++;
                a=i;// 记录结果
            }
            i++;
        }
        System.out.print(a);// 输出n互质的第k个正整数
    }
}

