package Shangguigu.oop.up;
/**
 * 练习5：将对象作为参数传递给方法
 * (1)定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 *
 * (2)定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 * public void printAreas(Circle c,int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 *
 * (3)在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
 *
 */

public class CircleTest {
 public static void main(String[] args){
     Cirlce c1 = new Cirlce();
     c1.radius = 2.1;
     // 方式一：
//     double area = c1.findArea();
//     System.out.println("圆的面积为"+area);

     // 方式二：
    c1.findArea();
 }

}

class Cirlce{
    // 属性
    double radius;
    // 求圆面积的方法
    // 方式一：
//    public double findArea(){
//        double area = Math.PI*radius*radius;
//        return area;
//    }

    // 方式二：
    public void findArea(){
        double area = Math.PI*radius*radius;
        System.out.println("圆的面积为"+area);
    }


}