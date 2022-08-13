package OJtest.week14;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

/**
 * 从n个球中取出k（k属于0，n）个球的所可能性的平方
 * 组合数C的求解：
 * 参开博客1：https://xizizzz.blog.csdn.net/article/details/113896568?spm=1001.2014.3001.5502
 * 参考博客2：https://blog.csdn.net/weixin_45480785/article/details/113896599
 */

public class test4 {
    // 方法一：
//    public static int f(int n,int m)//定义n个球中取m个球,组合求解
//    {
//        if(n<m) {
//            return 0;//如果n小于m，则不存在
//        }
//        if(n==m) {
//            return 1;        //只有一种取法
//        }
//        if(m==0) {
//            return 1;             //只有一种取法
//        }
//        return f(n-1,m-1)+f(n-1,m);//有一个球设置为特殊球x，所有取法分成两部分，划分标准
//    }

    //    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        long sum =0L;
//        long mod = 1000000007;
//        for(int m=1;m<=n/2;m++){
//            long k= f(n,m);
//            sum += (k*k)*2;
//        }
//        sum+=1;
//        System.out.print(sum%mod);
//    }

    // 方法二：
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        long sum =0L;
//        long mod = 1000000007;
//        long la[][] = new long[n+1][n+1];
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (j == 0||j==i) {
//                    la[i][j] = 1;
//                } else {
//                    la[i][j] = la[i - 1][j - 1] + la[i - 1][j];
//                }
//            }
//        }
//        for(long m:la[n]){
//            sum+=(m*m);
//        }
//        sum-=1;
//        System.out.print(sum%mod);
//    }

    // 方法三：
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        ArrayList<Long> tmp = new ArrayList<>();
//        tmp.add((long) 1);
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j > 0; j--) {
//                tmp.set(j, tmp.get(j) + tmp.get(j - 1));
//            }
//            tmp.add((long) 1);
//        }
//
//        long sum = 0L;
//        for (long m : tmp) {
//            sum += m * m;
//        }
//
//        sum -= 1;
//        System.out.println(sum % (1e9 + 7));
//    }

    // 方法四：
    static int qmi(int a,int k,int p) {
        //快速幂预处理 a^k%p  将k拆成二进制
        long res=1;
        while(k>0) {
            if((k&1)!=0) {
                res = res * a % p;
            };
            a=(int)((long)a*a%p);
            k>>=1;
        }
        return (int)res;
    }
    // 递归求j的阶乘
    public static int fact(int j,int p){
        int tmp=1;
        for (int i = 1; i < (j+1); i++) {
            tmp=(int)((long)tmp*i%p);
        }
        return tmp;
    }
    // 费马小定理求j的逆元阶乘
    public static int infact(int j,int p){
        int tmp=1;
        for (int i = 1; i < (j+1); i++) {
            tmp=(int)((long)tmp*qmi(i,p-2,p)%p);
        }
        return tmp;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p=(int)1e9+7;
        int res=(int)((long)fact(2*n,p)*infact(n,p)%p*infact(n,p)%p);
        System.out.println(res-1);
    }
}
