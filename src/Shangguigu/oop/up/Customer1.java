package Shangguigu.oop.up;

/*
 * JavaBean 是一种 Java 语言写成的可重用组件。
 * 所谓 javaBean，是指符合如下标准的 Java 类：
 * 		> 类是公共的
 * 		> 有一个无参的公共的构造器
 * 		> 有属性，且有对应的 get、set 方法
 *
 */
public class Customer1 {

    private int id;
    private String name;

    public Customer1(){

    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}
