package Shangguigu.oop.middle;

/**
 * 可变个数形参的方法：数据类型 ... 变量名
 * 当调用可变个数形参的方法时，传入的参数个数是：0个，1个，2个。。。
 * 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载，即无法共存（下面注释调的就是例子）
 *
 * */

public class MethodArgsTest {
    public static void main(String[] args){
        MethodArgsTest test = new MethodArgsTest();
        test.show("hello");
    }
    public void show(String s){
        System.out.println("show(String)");
    }
    //    public void show(String[] strs){} 与下面的可变形参效果相同
    public void show(String ... strs){
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }


}
