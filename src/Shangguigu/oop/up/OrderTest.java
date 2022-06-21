package Shangguigu.oop.up;

public class OrderTest {
    public static void main(String[] args){

        Order1 order = new Order1();
        // 出了order类后，私有的结构就不可以使用
//        order.orderPrivate = 1;
        order.orderDefault = 2;
        order.orderPublic = 3;
        // 同上，一样不可使用
//        order.methodPrivate();
    }
}
