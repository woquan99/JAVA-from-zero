package Shangguigu.oop.up;

/*
 * this 关键字的使用
 * 1.this 用来修饰、调用：属性、方法、构造器
 *
 * 2.this 修饰属性和方法:
 * 		this 理解为：当前对象  或  当前正在创建的对象。
 *
 *  2.1 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性和方法。
 *  	通常情况下，我们都选择省略“this.”。特殊情况下，如果方法的形参和类的属性同名，我们必须显式
 *  	的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *
 *  2.2 在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用正在创建的对象属性和方法。
 *  	但是，通常情况下，我们都选择省略“this.”。特殊情况下，如果构造器的形参和类的属性同名，我们必须显式
 *  	的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *
 *  3.this 调用构造器
 *  	① 我们可以在类的构造器中，显式的使用"this(形参列表)"的方式，调用本类中重载的其他的构造器！
 *  	② 构造器中不能通过"this(形参列表)"的方式调用自己。
 *  	③ 如果一个类中声明了n个构造器，则最多有n -1个构造器中使用了"this(形参列表)"。
 *  	④ "this(形参列表)"必须声明在类的构造器的首行！
 *  	⑤ 在类的一个构造器中，最多只能声明一个"this(形参列表)"。
 */
public class PersonTest4 {

    public static void main(String[] args) {
        Person4 p1 = new Person4();

        p1.setAge(1);
        System.out.println(p1.getAge());

        p1.eat();
        System.out.println();

        Person4 p2 = new Person4("jerry" ,20);
        System.out.println(p2.getAge());
    }
}
class Person4{

    private String name;
    private int age;

    public Person4(){
        this.eat();
        String info = "Person 初始化时，需要考虑如下的 1,2,3,4...(共 40 行代码)";
        System.out.println(info);
    }

    public Person4(String name){
        this();
        this.name = name;
    }

    public Person4(int age){
        this();
        this.age = age;
    }

    public Person4(String name,int age){
        this(age);	//调用构造器的一种方式，调用56行
        this.name = name;
//		this.age = age;// 62行已经调用了，所以无需再写一次，故注释掉
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }

    public void study(){
        System.out.println("学习");
    }
}

