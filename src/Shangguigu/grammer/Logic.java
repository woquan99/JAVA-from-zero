package Shangguigu.grammer;
/**
 * 区别 & and &&
 * 相同点：运算结果都一样
 * 不同点：当符号左边是false时，& 继续执行符号右边的运算，&& 不再执行符号右边的运算
 * 开发中推荐使用&&
 *
 * 区别 | and ||
 * 相同点：运算结果都一样
 * 不同点：当符号左边是true时，| 继续执行符号右边的运算，|| 不再执行符号右边的运算
 * 开发中推荐使用||
 *
 * 三元运算符
 * 结构：（条件表达式）？表达式1：表达式2
 * 表达式为TRUE，执行表达式1；否则，执行表达式2
 * 表达式1和表达式2的要求是一致的
 */


public class Logic {
    public static void main(String[] args){
        // 利用位运算符来交换两个变量的值
        int num1 = 12;
        int num2 = 10;
        num1 = (num1^num2);
        num2 = (num1^num2);
        num1 = (num1^num2);
        System.out.println("num1 = "+num1+",num2 = "+num2);
        int max = (num1>num2)?num1:num2;
        System.out.println("max = "+max);

        }
}
