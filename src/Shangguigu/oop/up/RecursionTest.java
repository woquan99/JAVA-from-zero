package Shangguigu.oop.up;

/**
 * 递归方法的使用(了解)
 * 1.递归方法：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 3.递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 *
 */
public class RecursionTest {

    public static void main(String[] args) {

        // 例1:计算1-100之间所有自然数的和
        // 方法1:
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // 方法2:
        RecursionTest test = new RecursionTest();
        int sum1 = test.getSum(100);
        System.out.println("sum1 = " + sum1);
    }

    // 例1:计算1-n之间所有自然数的和
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    // 例2:计算1-n之间所有自然数的乘积
    //归求阶乘(n!)的算法
    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }

    //例4:已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
    //其中n是大于0的整数，求f(10)的值。
    public int f(int n){
        if(n==20){
            return 1;
        }else if(n==21){
            return 4;
        }else {
            return f(n-1)*2+f(n-2);
        }
    }
}
