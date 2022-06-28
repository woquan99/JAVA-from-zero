package Shangguigu.oop.middle.class2;

/*
 * 方法的重写(override/overwrite)
 *
 * 1.重写：子类继承父类以后，可以对父类中的方法进行覆盖操作。
 * 2.应用：重写以后，当创建子类对象以后，通过子类对象去调用子父类中同名同参数方法时，执行的是子类重写父类的方法。
 *   即在程序执行时，子类的方法将覆盖父类的方法。
 *
 * 面试题：区分方法的重载与重写(有的书也叫做“覆盖”)
 * 	答： 方法的重写Overriding和重载Overloading是Java多态性的不同表现。
 * 	    重写Overriding是父类与子类之间多态性的一种表现，重载Overloading是一个类中多态性的一种表现。
 * 		如果在子类中定义某方法与其父类有相同的名称和参数，我们说该方法被重写 (Overriding)。
 * 		子类的对象使用这个方法时，将调用子类中的定义，对它而言，父类中的定义如同被"屏蔽"了。
 * 		如果在一个类中定义了多个同名的方法，它们或有不同的参数个数或有不同的参数类型，则称为方法的重载(Overloading)。
 */
public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student("计算机科学与技术");
        s.eat();
        s.walk(10);
        s.study();
    }
}

