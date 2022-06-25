package OJtest;

import java.util.Scanner;

/**
 * 编程题-输入一个数（任意位数），倒序输出
 * 输入格式：12345y
 * 输出格式：y54321
 * */
public class week7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.next();

        // 方法一：
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.reverse();
        String s1 = stringBuilder.toString();
        System.out.println(s1);

        // 方法二：
        String b = "";
        for(int i=a.length()-1;i>=0;i--){ // 长度为【0，a.length-1】
            b += a.charAt(i);
        }
        System.out.println(b);

        // 方法三：
        // 字符串转化为字符数组
        char[] charArray = a.toCharArray();
        char[] charArray1 = new char[a.length()];
        for(int i=0;i<charArray.length;i++){
            charArray1[i] = charArray[charArray.length-i-1];
        }
        //字符数组转化为字符串
        String c = new String(charArray1);
        System.out.println(c);


    }
}