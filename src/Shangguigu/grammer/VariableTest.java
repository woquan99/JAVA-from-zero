package Shangguigu.grammer;
/**
 * 变量的格式： 数据类型 变量名 = 变量值；
 *
 * 数据类型：
 * 1.基本数据类型：
 * a.数值型:
 * 整型（byte short int long）、
 * 浮点型（float 4字节 单精度浮点数 定义该变量时，变量要以f结尾  / double 8字节 双精度浮点数 表示的数值范围小于float ）
 * 整型常量默认类型为 int 型；浮点型常量，默认类型为 double 型
 *
 * b.字符型：char（1字符=2字节）
 * 定义浮点型变量时，通常使用一对‘’，且内部只能写一个字符
 *
 * c.布尔型：boolean
 * 取值只能是：true false
 *
 * 2.引用数据类型：
 * a.类（class） b.接口（interface） c.数组（[]）
 *
 * 500MB 1MB=1024KB 1KB=1024B B是byte    1 byte = 8 bits
 * bit:计算机中最小的存储单位；byte:计算机中基本存储单位
 * */

public class VariableTest {
    public static void main(String[] args){
//        整型（byte -128~127 /short / int 约21亿 / long 声明long型变量，必须以l结尾）
//        浮点型（float double）
        int myAge = 12;
        char c1 = 'a';
        char c5 = '\n';// 换行符
        char c6 = '\t';// 制表符
        System.out.println("hello"+c5);
        System.out.println("hello"+c6);
        System.out.println(c1);
        System.out.println("Hello World!");
        boolean isMarried = true;
        if(isMarried){
            System.out.println("you can't take part in the single dog's party!\n What a pity!");
            System.out.println("you can't take part in the single dog's party!\\n What a pity!");
            System.out.println("you can't take part in \"the single dog\"'s party!\n What a pity!");
        }
    }
}
