package Shangguigu.grammer;

public class Calculate {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 3;
        System.out.println(num1/num2);
        System.out.println((double) num1/num2);

        // %:取余运算
        // 结果的符号与被模数的符号相同(就是分子；补充：除号后面的数叫做除数,除号前面的数叫做被除数)
        int m1 = 12;
        int n1 = 5;
        System.out.println(m1%n1);// 2
        int m2 = -12;
        int n2 = 5;
        System.out.println(m2%n2);// -2
        int m3 = 12;
        int n3 = -5;
        System.out.println(m3%n3); // 2


    }
}
