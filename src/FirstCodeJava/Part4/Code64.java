package FirstCodeJava.Part4;

/**
 * 实例化一个computer计算机类的对象；然后在计算机上插入（引用传递）USB设备（USB接口子类）
 * 涉及到的代码：P246 60\62\61\63\64
 * */
// 定义USB标准
interface USB { 					// 定义标准一定就是接口
    public void start();				// USB设备开始工作
    public void stop();				// USB设备停止工作
}
// 定义计算机类
class Computer {
    public void plugin(USB usb) {		// 插入USB接口设备（子类对象）
        usb.start(); 					// 开始工作
        usb.stop();						// 停止工作
    }
}
// 定义U盘子类（USB接口子类1）
class Flash implements USB {		// 实现USB接口
    public void start() {
        System.out.println("U盘开始使用");
    }
    public void stop() {
        System.out.println("U盘停止使用");
    }
}
// 定义打印机子类（USB接口子类2）
class Print implements USB {		// 实现打印机接口
    public void start() {
        System.out.println("打印机开始使用");
    }
    public void stop() {
        System.out.println("打印机停止使用");
    }
}
public class Code64 {
        public static void main(String args[]) {
            Computer com = new Computer();		    // 实例化计算机类
            com.plugin(new Flash());				// 插入USB接口设备
            com.plugin(new Print());				// 插入打印机接口设备
        }
    }

