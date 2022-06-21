package Shangguigu.oop.up;

/*
 * 类的结构之三:构造器(构造方法、constructor)的使用
 * construction:China Construction Bank(CCB,中国建设银行)
 * constructor:
 *
 * 一、构造器的作用:
 * 1.创建对象
 * 2.初始化对象的属性
 *
 * 二、说明
 * 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器。
 * 2.定义构造器的格式:
 * 			      权限修饰符  类名(形参列表) { }
 * 3.一个类中定义的多个构造器，彼此构成重载。
 * 4.一旦显示的定义了类的构造器之后，系统不再提供默认的空参构造器。
 * 5.一个类中，至少会有一个构造器
 */
public class PersonTest3 {
    public static void main(String[] args) {
        //创建类的对象:new + 构造器
        Person3 p1 = new Person3();	//Person()这就是构造器
        p1.eat();

        Person3 p2 = new Person3("Tom");
        System.out.println(p2.name);
        Person3 p3 = new Person3("Tom",12);
        System.out.println(p3.name+"的年龄是"+p3.age);
    }
}
class Person3{
    //属性
    String name;
    int age;

    //构造器
    public Person3(){
        System.out.println("Person()......");
    }

    public Person3(String n){
        name = n;
    }

    public Person3(String n,int a){
        name = n;
        age = a;
    }

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void study(){
        System.out.println("人学习");
    }
}
