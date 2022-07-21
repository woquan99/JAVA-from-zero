package OJtest.week13;

import java.util.Scanner;

/**
 * 给出一整数n，计算用2~n-1进制表示n时，每一个进制下所有位上的数字的和的平均数（结果用分数表示）
 * （结果用分数表示）
 * 注意，
 * 申间过程及输出均采用10进制
 * AC解法（C++）:https://blog.csdn.net/qecode/article/details/80297240
 *
 * 无法从静态上下文中引用非静态变量，非静态方法”原因及解决:
 * （1）用static修饰的方法为静态方法，修饰变量则为静态变量，又分别叫做类方法或者类变量。这些从属于类，是类本身具备的，没有实例也会存在。
 * （2）而非静态方法和变量的存在依赖于对象，是对象的属性，需要先创建实例对象，然后通过对象调用。
 */

public class test2 {

    public static int GetGreateatCommonDivision(int j,int k){ // 方法前加static直接调用
        if(k==0)
            return j;
        else return GetGreateatCommonDivision(k,(j%k));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int temp;
        for(int i=2;i<=(n-1);i++){
            temp = n;
            while (temp!=0){
                sum += (temp%i);
                temp /=i;
            }
        }
        n = n-2;
        // 方法一：
//        test2 sort = new test2();
//        int iGCD = sort.GetGreateatCommonDivision(sum,n);
        // 方法二：
        int iGCD = GetGreateatCommonDivision(sum,n);
        sum /= iGCD;
        n /= iGCD;
        System.out.println(sum+"/"+n);
    }
}
