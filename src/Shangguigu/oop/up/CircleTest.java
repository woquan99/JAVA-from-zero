package Shangguigu.oop.up;

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