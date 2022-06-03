package Shangguigu.grammer;
/**
 * 基本数据类型之间的运算规则：
 * 前提：只有7种运算，不包括 boolean 类型的
 * 1.自动类型提升：
 * byte\short\char --> int --> long --> float --> double
 * 容量小的和容量大的做运算，结果自动提升为容量大的类型
 * 当 byte\short\char 三种变量做运算时，结果为 int 型
 *
 *
 * 2.强制类型转换（自动类型提升的逆运算），可能导致精度损失
 * 需要使用强转符（）；
 *
 *
 * */
public class Variable2 {
    public static void main(String[] args){
        byte b1 = 2;
        int i1 = 129;
        float f = b1+i1;

        System.out.println(b1+i1);
        System.out.println(f);
        // ********************************************
        char c1 = 'a';
        int c2 = 10;
        System.out.println('a'+10);
        // **************************************************
        double d1 =12.3;
        int d2 = (int)d1;// 截断操作
        System.out.println(d2);
        byte g =1;
//        float g1 = g+13.3;(系统会自动提示报错)

    }
}
