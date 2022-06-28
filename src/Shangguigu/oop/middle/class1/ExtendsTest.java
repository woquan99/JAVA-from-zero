package Shangguigu.oop.middle.class1;

/*
 * 面向对象的特征二:继承性
 *
 * 为什么要有继承？
 * 		多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，
 * 		那么多个类无需再定义这些属性和行为，只要继承那个类即可。
 *  * 一、继承性的好处
 * ① 减少了代码的冗余，提高了代码的复用性；
 * ② 便于功能的扩展；
 * ③ 为之后多态性的使用，提供了前提。
 *
 * 二、继承性的格式
 * 	class A extends B{}
 *  A:子类、派生类、subclass
 *  B:父类、超类、基类、superclass
 *
 *  2.1 体现：一旦子类 A 继承父类以后，子类 A 中就获取了父类 B 中声明的结构：属性、方法
 * 		特别的，父类中声明为 private 的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
 * 		只有因为封装性的影响，使得子类不能直接调用父类的结构而已。
 *  2.2 子类继承父类以后，还可以声明自己特有的属性或方法，实现功能的拓展。
 *  	子类和父类的关系：不同于子集与集合的关系。
 *  	extends:延展、扩展
 *
 * 三、Java 中关于继承性的规定：
 *  	1.一个类可以被多个类继承
 *  	2.Java 中类的单继承性：一个类只能有一个父类
 *  	3.子父类是相对的概念。
 *  	4.子类直接继承的父类，称为：直接父类。间接继承的父类，称为，间接父类。
 *  	5.子类继承父类后，就获取了直接父类以及所有间接父类中声明的属性和方法。
 *
 * 四、1.如果我们没有显式的声明一个类的父类的话，则此类继承于 java.lang.Object 类
 * 	  2.所有的 java 类(除 java.long.Object 类之外)都直接或间接地继承于 java.lang.Object 类;
 * 	  3.意味着，所有的 java 类具有 java.lang.Object 类声明的功能。
 */
public class ExtendsTest {
    public static void main(String[] args) {

        Person p1 = new Person();
		p1.setAge(1);
        p1.eat();
        System.out.println(p1.getAge());
        System.out.println("********************");

        Student s1 = new Student();
        s1.eat();
        s1.name = "Tom";
        s1.setAge(10);
        System.out.println(s1.getAge());
        s1.brease();
        Creature c = new Creature();
        System.out.println(c.toString());

    }
}
