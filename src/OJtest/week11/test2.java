package OJtest.week11;

import java.util.Scanner;

/**
 * 题目来源：https://matiji.net/exam/dohomework/1081/2
 * Lucas定理:C(n+m,n) mod p = C(n+m/p,n/p)*C(n+m%p,n%p) % p
 * 给定整数n,m,p，计算C(n+m,n) mod p的值。
 * 输入格式：一行包含三个整数 n,m,p
 * 输出格式：一行包含一个整数C(n+m,m) mod p
 *
 *
 */

/**

public class test2 {
    public static void main(String[] args){
        // 方法一：组合数较大的时候性能过差
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

 */

public class test2 {
    public static void main(String[] args){
        int sum1=1;
        int sum2=1;
        int sum3=1;
        int sum4=1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int p = input.nextInt();
        int s1=(n+m)/p,s2=n/p,s3=(n+m)%p,s4=n%p;
        for(int i= 1;i<=s2;i++){
            sum1 = sum1*(s1-s2+i);
            sum2 = sum2*i;
        }
        for(int i= 1;i<=s4;i++){
            sum3 = sum3*(s3-s4+i);
            sum4 = sum4*i;
        }
        System.out.print(((sum1/sum2)*(sum3/sum4))%p);
    }
}



/**


#include <cstdio>
#include <cctype>
#include <cstring>
#include <algorithm>
using namespace std;

          typedef long long u64;

          const int maxn = 100000 + 10;
          u64 n, m, p, fac[maxn];

          inline u64 Fast_Pow(u64 x, u64 k) {
              u64 ans = 1;
              while(k) {
                  if( k&1 ) ans = ans * x % p;
                  k >>= 1, x = x * x % p;
              }
              return ans;
          }

          u64 C(u64 k, u64 b) {
              if( k<b )  return 0;
             return fac[k] * Fast_Pow(fac[b] % p, p-2) % p * Fast_Pow(fac[k-b] % p, p-2) % p;
         }

         u64 Lucas(u64 k, u64 b) {
             if( !b )  return 1;
             return C(k%p, b%p) * Lucas(k/p, b/p) % p;
         }

         int main(int argc, char const *argv[])
         {
             int t;  scanf("%d", &t);
            while( t-- ) {
                 fac[0] = 1;
                 scanf("%lld%lld%lld", &n, &m, &p);
                 for(int i=1; i<=p; ++i)
                     fac[i] = fac[i-1] * i % p;
                 printf("%lld\n", Lucas(n+m, m));
             }
             return 0;
         }

 */

