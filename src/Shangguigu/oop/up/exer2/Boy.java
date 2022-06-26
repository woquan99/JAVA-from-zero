package Shangguigu.oop.up.exer2;

public class Boy {
    private String name;
    private int age;
    public Boy(){}// 空参构造器
    public Boy(String name,int age){
        this.name=name;
        this.age =age;
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
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
        if(this.age>=22){
            System.out.println("可以考虑结婚");
        }else{
            System.out.println("好好学习");
        }
    }

}
