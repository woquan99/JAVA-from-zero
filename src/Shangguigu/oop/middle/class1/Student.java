package Shangguigu.oop.middle.class1;

// 为了描述和处理学生的信息，定义类Student
public class Student extends Person{
    String major;
    public Student(){
    }

    public Student(String name, int age, String major){
        this.name = name;
//        this.age = age;
        setAge(age);
        this.major = major;
    }
    public void study(){
        System.out.println("学习");
    }

    public void show(){
        System.out.println("name:" + name + ",age = " + getAge());
    }


}
