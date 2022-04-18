package FirstCodeJava.Part9;

/**
 * 利用Runnable接口实现多线程
 * 启动了三个线程对象，但3个线程对象都占着同一个Runnable接口对象的引用，实现了数据共享的操作
 * 涉及到的代码：P380 9-9
 * */
class MyThread1 implements Runnable { 		// 线程的主体类
    private int ticket = 5; 						// 一共5张票
    @Override
    public void run() { 							// 线程的主方法
        for (int x = 0; x < 50; x++) {			// 循环50次
            if (this.ticket > 0) {
                System.out.println("卖票，ticket = " + this.ticket --);
            }
        }
    }
}

public class Code8 {
    public static void main(String[] args) throws Exception {
        // 测试一：占用同一个的Runnable接口对象
//        MyThread1 mt = new MyThread1();        // 创建线程对象
//        new Thread(mt).start();                // 启动线程
//        new Thread(mt).start();                // 启动线程
//        new Thread(mt).start();                // 启动线程


        // 测试二：占用3个不同的Runnable接口对象
        MyThread1 mt1 = new MyThread1() ;		// 创建线程对象
        MyThread1 mt2 = new MyThread1() ;		// 创建线程对象
        MyThread1 mt3 = new MyThread1() ;		// 创建线程对象
        new Thread(mt1).start();
        new Thread(mt2).start();
        new Thread(mt3).start();

    }
}
