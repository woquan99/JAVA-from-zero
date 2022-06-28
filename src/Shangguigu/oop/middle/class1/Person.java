package Shangguigu.oop.middle.class1;

public class Person {
    private int age;
    String name;
    public Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age =age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void eat(){
        System.out.println("吃饭");
        sleep();
    }

    private void sleep(){
        System.out.println("睡觉");
    }
}
