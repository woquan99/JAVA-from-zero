package Shangguigu.grammer;
/**
 * 1.二进制：以 0b 或 0B 开头
 * 2.八进制：以数字0开头
 * 3.十六进制：以 0x 或 0X 开头表示，0-9及A-F，此处的A-F不区分大小写
 * 4.运算结果依旧是 String 类型
 *
 *
 * 十进制 --> 二进制 ：除2取余的逆
 * 例如： 13  不断取余变为1011000000000.。。 取逆：1101
 *
 * */
public class Binary {
    public static void main(String[] args){
        /**将一个0~255范围内的整数表示为十六进制值*/
        // 自动实现 （手动就算了，麻烦）
        String str1 = Integer.toBinaryString(60);
        String str2 = Integer.toHexString(60);
        System.out.println(str1);
        System.out.println(str2);
    }
}
