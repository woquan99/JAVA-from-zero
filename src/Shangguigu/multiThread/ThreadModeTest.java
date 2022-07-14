package Shangguigu.multiThread;

/**
 * 测试 Thread 类的常用方法
 * 1.start():启动当前线程，执行当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread(): 静态方法，返回当前代码执行的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():释放当前 CPU 的执行权
 * 7.join():在线程 a 中调用线程 b 的join(),此时线程 a 就进入阻塞状态，直到线程 b 完全执行完以后，线程 a 才
 *          结束阻塞状态。
 * 8.stop():已过时。当执行此方法时，强制结束当前线程。
 * 9.sleep(long millitime)：让当前线程“睡眠”指定时间的millitime毫秒)。在指定的millitime毫秒时间内，
 *                          当前线程是阻塞状态的。
 * 10.isAlive()：返回boolean，判断线程是否还活着
 */

/**
 * - 线程的优先级等级
 *   - MAX_PRIORITY：10
 *   - MIN _PRIORITY：1
 *   - NORM_PRIORITY：5 --->默认优先级
 * - 涉及的方法
 *   - getPriority() ：返回线程优先值
 *   - setPriority(int newPriority) ：改变线程的优先级
 *
 *   说明:高优先级的线程要抢占低优先级线程 cpu 的执行权。
 *       但是只是从概率上讲，高优先级的线程高概率的情况下被执行。
 *       并不意味着只有当高优先级的线程执行完以后，低优先级的线程才会被执行。
 */


class HelloThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 100; i++){

//            try {
//                sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            if(i % 2 == 0){
                System.out.println(getName() + ":" + getPriority()+":"+i);
            }
//            if(i % 20 == 0){
//                yield();
//            }
        }
    }

    public HelloThread(String name){
        super(name);
    }

}


public class ThreadModeTest {
    public static void main(String[] args) {
//        HelloThread h1 = new HelloThread("Thread : 1");
//        h1.setName("线程一");// 设置线程的名字
//        h1.start();
        HelloThread h2 = new HelloThread("Thread : 1");
        h2.setName("线程二");// 设置线程的名字
        h2.start();
        h2.setPriority(Thread.MAX_PRIORITY);

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for(int i = 0;i < 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority()+":"+i);
            }

//            if(i == 20){
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }

//        System.out.println(h1.isAlive());
        // 此时线程 h1 已经完全执行完毕
        System.out.println(h2.isAlive());
    }
}
