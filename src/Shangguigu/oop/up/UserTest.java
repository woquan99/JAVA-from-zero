package Shangguigu.oop.up;

/**
 * 类中属性的使用
 *
 * 属性(成员变量)	vs	局部变量
 * 1.相同点:
 * 		1.1 定义变量的格式:数据类型 变量名 = 变量值
 * 		1.2 先声明，后使用
 * 		1.3 变量都有其对应的作用域
 *
 * 2.不同点:
 * 		2.1 在类中声明的位置不同
 * 		属性:直接定义在类的一对{}内
 * 		局部变量:声明在方法内、方法形参、构造器形参、构造器内部的变量
 *
 * 		2.2 关于权限修饰符的不同
 * 		属性:可以在声明属性时，指明其权限，使用权限修饰符。
 * 			常用的权限修饰符:private、public、缺省、protected
 * 			目前声明属性时，都使用缺省即可。
 * 		局部变量:不可以使用权限修饰符。
 *
 * 		2.3 默认初始化值的情况:
 * 		属性:类的属性，根据其类型，都有默认初始化值。
 * 			整型(byte、short、int、long):0
 * 			浮点型(float、double):0.0
 * 			字符型(char):0(或‘\u0000’)
 * 			布尔型(boolean):false
 *
 * 			引用数据类型(类、数组、接口):null
 *
 * 		局部变量:没有默认初始化值
 * 			意味着:在调用局部变量之前，一定要显式赋值。
 * 			特别地:形参在调用时,赋值即可。例，47 行
 *
 * 		2.4 在内存中加载的位置，亦各不相同。
 * 		属性:加载到堆空间中(非 static)
 * 		局部变量:加载到栈空间
 *
 *
 *   总结:属性赋值的先后顺序
 *
 *   ① 默认初始化值
 *   ② 显式初始化
 *   ③ 构造器中赋值
 *   ④ 通过"对象.方法" 或 “对象.属性”的方式，赋值
 *
 *   以上操作的先后顺序:① - ② - ③ - ④
 *
 *
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);

        u1.talk("俄语");
    }
}
class User{
    //属性(或成员变量)
    String name;	//不加 private 即为缺省
    public int age;	//不加 public 即为缺省
    boolean isMale;

    public void talk(String language){//language:形参，也是局部变量
        System.out.println("我们使用" + language + "进行交流。");
    }

    public void eat(){
        String food = "烙饼";	//烙饼:局部变量
        System.out.println("北方人喜欢吃:" + food);
    }

    public User(){

    }

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }

}
