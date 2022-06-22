package Shangguigu.oop.up;

/*
 * 编写两个类，TriAngle 和 TriAngleTest，
 * 其中 TriAngle 类中声明私有的底边长 base 和高 height，同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 *
 */
class TriAngle {

    private double base;//底边长
    private double height;//高

    public TriAngle(){

    }

    public TriAngle(double b,double h){
        base = b;
        height = h;
    }

    public void setBase(double b){
        base = b;
    }

    public double getBase(){
        return base;
    }

    public void setHeight(double h){
        height = h;
    }

    public double getHeight(){
        return height;
    }
}

public class TriangleTest {
    public static void main(String[] args) {

        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.5);
//		t1.base = 2.5;//The field TriAngle.base is not visible
//		t1.height = 4.3;
        System.out.println("base : " + t1.getBase() + ",height : " + t1.getHeight());

        TriAngle t2 = new TriAngle(5.1,5.6);
        System.out.println("面积 : " + t2.getBase() * t2.getHeight() / 2);

    }
}
