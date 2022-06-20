package Shangguigu.oop.up;
/*
 * 练习5：将对象作为参数传递给方法
 * (1)定义一个Circle1类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 *
 * (2)定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 * public void printAreas(Circle c,int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 *
 * (3)在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
 *
 */

public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle1 c = new Circle1();
        test.printAreas(c, 5);
        System.out.println("now radius is:" + c.radius);
    }

    public void printAreas(Circle1 c,int time){
        System.out.println("Radius\t\tAreas");

        //设置圆的半径
        for(int i = 1;i <= time ;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }

        //重新赋值
        c.radius = time + 1;
    }
}

class Circle1 {

    double radius;	//半径

    //返回圆的面积
    public double findArea(){
        return radius * radius * Math.PI;
    }
}
