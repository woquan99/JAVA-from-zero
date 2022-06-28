package Shangguigu.oop.up.exer2;

public class Girl {
    private String name;
    private int age;
    public Girl(){}// 空参构造器
    public Girl(String name,int age){
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
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);// this代表当前对象，谁调用marry,谁就是this
    }
    /**
     *
     * @Description 比较两个对象的大小
     * @author woquan
     * @date 2022 年 6 月 26 日上午 9:17:35
     * @param girl
     * @return 正数，当前对象大；负数：当前对象小；0则是相等
     */
    public int compare(Girl girl){
        if(this.age>girl.age)
            return 1;
        else if(this.age<girl.age)
            return -1;
        else return 0;
    }
}
