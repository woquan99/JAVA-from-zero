package FirstCodeJava.Part8;

class Point {							// 定义坐标
    private Object x ; 					// 可以保存任意数据
    private Object y ; 					// 可以保存任意数据
    public void setX(Object x) {
        this.x = x;
    }
    public void setY(Object y) {
        this.y = y;
    }
    public Object getX() {
        return x;
    }
    public Object getY() {
        return y;
    }
}

public class Code8 {
    public static void main(String[] args) {
        // 第一步：根据需要设置数据，假设此时的作用是传递坐标
        Point p = new Point() ;					// 实例化Point类数据
        p.setX(10);								// 设置坐标数据
        p.setY(20);								// 设置坐标数据
        // 第二步：根据设置好的坐标取出数据进行操作
        int x = (Integer) p.getX();				// 取出坐标数据
        int y = (Integer) p.getY();				// 取出坐标数据
        System.out.println("x坐标：" + x + "，y坐标：" + y);

        p.setX(10.2);								// 设置坐标数据
        p.setY(20.3);								// 设置坐标数据
        // 第二步：根据设置好的坐标取出数据进行操作
        double x1 = (Double) p.getX(); 				// 取出坐标数据
        double y1 = (Double) p.getY(); 				// 取出坐标数据
        System.out.println("x坐标：" + x1 + "，y坐标：" + y1);

        p.setX("东经100度");						    // 设置坐标数据
        p.setY("北纬20度");							// 设置坐标数据
        // 第二步：根据设置好的坐标取出数据进行操作
        String x2 = (String) p.getX(); 				// 取出坐标数据
        String y2 = (String) p.getY(); 				// 取出坐标数据
        System.out.println("x坐标：" + x2 + "，y坐标：" + y2);

    }

}
