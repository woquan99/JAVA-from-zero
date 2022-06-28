package Shangguigu.oop.middle.class2;

public class Student extends Person{

    String major;
    public Student(){
    }

    public Student(String major){
        this.major = major;
    }

    public void study(){
        System.out.println("学习，专业是:" + major);
    }

    // 对父类中的 eat() 进行了重写
    public void eat(){
        System.out.println("学生应该多吃有营养的。");
    }

    public void show(){
        System.out.println("我是一个学生。");
    }

    public String info(){
        return null;
    }


    // 可以直接将父类的方法的第一行粘过来，直接写方法体
//	public void walk(int distance){
//		System.out.println("重写的方法");
//	}

    //直接输入父类的方法名，Alt + /，选择即可生成
    @Override
    public void walk(int distance) {
        System.out.println("自动生成");
    }
}

