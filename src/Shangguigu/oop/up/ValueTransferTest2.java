package Shangguigu.oop.up;

public class ValueTransferTest2 {
    public static void main(String[] args){
        int a=10;
        int b=20;
        method(a,b);// 需要在method被调用后，仅打印出a=100;b=200,请写出method方法的代码
        System.out.println("a"+a);
        System.out.println("b"+b);
    }

//    public void method(int a,int b){// 无对象，无法调用method
    public static void method(int a,int b){
         a = a*10;
         b = b*10;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.exit(0);
    }
}
