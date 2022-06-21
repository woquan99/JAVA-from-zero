package Shangguigu.oop.up;


/**
 * 1.创建程序,在其中定义两个类：Person 和 PersonTest 类。
 * 定义如下：用 setAge()设置人的合法年龄(0~130)，用 getAge()返回人的年龄。
 *
 */
class Person2 {
    private int age;
    public void setAge(int a){
        if(a < 0 || a > 130){
			throw new RuntimeException("传入的数据据非法");
        }
        age = a;
    }

    public int getAge(){
        return age;
    }

    //绝对不能这样写！！！
    public int doAge(int a){
        age = a;
        return age;
    }
}

/*
 *  在 PersonTest 类中实例化 Person 类的对象 b，
 *  调用 setAge()和 getAge()方法，体会 Java 的封装性。
 */
public class PersonTest2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
//		p1.age = 1;	//编译不通过

        p1.setAge(146);
        System.out.println("年龄为:" + p1.getAge());
    }
}

