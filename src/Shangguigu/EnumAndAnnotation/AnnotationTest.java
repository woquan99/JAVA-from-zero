package Shangguigu.EnumAndAnnotation;


import java.util.Date;

public class AnnotationTest {
    public static void main(String[] args){
        Person5 p = new Student5();
        p.walk();
        Date date = new Date(2022,07,27);
        System.out.println(date);

    }
}
class Person5{

    private String name;
    private int age;
    public Person5() {
    }
    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println("学习中……");
    }
    public void eat(){
        System.out.println("摸鱼中……");
    }
}

interface Info5{
    void show();
}

class Student5 extends Person5 implements Info5{
    @Override
    public void walk(){
        System.out.println("喷子走开");
    }
    @Override
    public void show(){
    }
}