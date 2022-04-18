package FirstCodeJava.Part9;

/**
 * 通过继承Thread类实现卖票程序
 * 定义了三个线程对象，每个线程对象各自卖了5张票
 * 涉及到的代码：P379 9-7
 * */
class MyThread extends Thread { 				    // 线程的主体类
    private int ticket = 5; 						// 一共5张票
    @Override
    public void run() { 							// 线程的主方法
        for (int x = 0; x < 50; x++) {			    // 循环50次
            if (this.ticket > 0) {
                System.out.println("卖票，ticket = " + this.ticket --);
            }
        }
    }
}
public class Code7 {
    public static void main(String[] args) throws Exception {
        MyThread mt1 = new MyThread() ;		// 创建线程对象
        MyThread mt2 = new MyThread() ;		// 创建线程对象
        MyThread mt3 = new MyThread() ;		// 创建线程对象
        mt1.start() ;						    // 启动线程
        mt2.start() ;							// 启动线程
        mt3.start() ;							// 启动线程
    }
}
