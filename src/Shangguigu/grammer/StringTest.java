package Shangguigu.grammer;
/**
 * 1.String 属于引用数据类型，属于 Class
 * 2.声明 String 变量时，使用一对 “ ”
 * 3.String可以和 8 种基本数据类型做运算，且运算只能是连接运算：+
 * 4.运算结果依旧是 String 类型
 * */
public class StringTest {
    public static void main(String[] args){
//        String a = 123;编译不通过
        String a = 123+"";
//        int  num = a;错误，String 只能用作连接，不可以和基本数据类型运算
//        int  num = (int)a;错误，
        int num = Integer.parseInt(a);
        System.out.println(num);// 表示整型
        System.out.println(a);// 表示字符串


    }
}
