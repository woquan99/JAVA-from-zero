package week1.java;

import static java.lang.Math.*;

import java.io.Console;
import java.nio.file.Paths;
import java.util.*;

public class FirstSample {
    public static void main(String[] args) throws Exception{

        System.out.println("I don't want to be a coder!");
        System.out.println(); /*这是只打印一个空行*/
        //this is also a method to demonstrate
        System.out.println("I don't want to be a coder!");
        System.out.println(0b1001);//加个ob表示二进制
        System.out.println(sqrt(4));
        String greeting = "Hello";
        String S = greeting.substring(0,3);         System.out.println(S);
        greeting = greeting.substring(0,3)+"p!";    System.out.println(greeting);
        System.out.println("Help!".equals(greeting));/*判断字符串是否相等*/

        // 常见的明文输入输出
        Scanner in = new Scanner(System.in);
        System.out.println("你的名字是；");
        String name = in.nextLine();
        System.out.println("你的年龄是；");
        int age = in.nextInt();
        System.out.println("Hello,"+name+".you will be "+(age+1)+" years old!");
        System.out.printf("Hello,%s.you will be %d years old!",name,age);
        System.out.printf("%tc",new Date());//打印出当前时间
        //密码形式
//        Console cons = System.console();
//        String username = cons.readLine("User name: ");
//        char[] passwd = cons.readPassword("Password:");
//        //?????????????????????????????????????/
        double x = 1000.0 /3.0;
        System.out.printf("%8.2f",x);
        //读取文件
        Scanner input = new Scanner(Paths.get("F:\\read.txt"),"UTF-8");
        System.out.println(input);

//      数组
        int[] a = new int[5];
        for(int i=0; i<a.length; i++)// 可以用array.length来获取数组中元素个数
            a[i] = i;
//        遍历方式1
        for(int i=0; i<a.length; i++)
            System.out.println(a[i]);
//        遍历方式2
        for(int element:a)
            System.out.println(element);
//        遍历方法3:元素被放置在括号内，并用逗号分隔
        System.out.println(Arrays.toString(a));

//      数组拷贝
        int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12;
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, 2*luckyNumbers.length);
        System.out.println(Arrays.toString(copiedLuckyNumbers));

//      多维数组



    }
}
