package Shangguigu.oop.middle.class1;

public class Person {
    private int age;
    private String name;
    public Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age =age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String name(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int age(){
        return this.age;
    }
}
