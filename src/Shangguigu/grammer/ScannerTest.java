package Shangguigu.grammer;
// 第一步调包
import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args){
        // 第二步实例化
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的名字：");
        String name = scan.next();

        System.out.println("请输入你的芳龄：");
        int age  = scan.nextInt();

        System.out.println("请输入你的体重：");
        double weight  = scan.nextDouble();
        // 对于char 的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别");
        String gender = scan.next();
        char genderchar = gender.charAt(0);
        System.out.println(genderchar);

        /** 随机产生一个两位数*/
        int number =(int)(Math.random()*90+10);
        int numberShi = number/10;
        int numberGe = number%10;

    }
}
