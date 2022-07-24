package Shangguigu.CommonClass;

/**
 * 一道面试题
 */
public class StringTest1 {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest1 ex = new StringTest1();
        ex.change(ex.str, ex.ch);
        // String不可变性，不能改变原来的good，只能重新创建一个空间放test ok，从而局部变量str和全局变量str指向不一样
        // char没有不可变性，所以指向同一个空间
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }
}
