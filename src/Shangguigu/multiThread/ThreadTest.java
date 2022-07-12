package Shangguigu.multiThread;

/**
 * 基本概念：
    进程：程序的一次执行过程；进程作为资源分配单位，系统在运行时会为每个进程分配不同的内存空间
    线程：一个程序内部的一条执行路径；若一个进程同一时间内并行执行多个线程，即支持多线程。
    线程是调度和执行的单位，每个线程拥有独立的运行栈和程序计数器。
    一个Java应用程序java.exe，其实至少有三个线程：main()主线程，gc()垃圾回收线程，异常处理线程。当然如果发生异常，会影响主线程。

    并行：多个 CPU 同时执行多个任务。比如：多个人同时做不同的事。
    并发：一个 CPU (采用时间片)同时执行多个任务。比如：秒杀、多个人做同一件事。

     多线程程序的优点：
     1.提高应用程序的响应。对图形化界面更有意义，可增强用户体验。
     2.提高计算机系统 CPU 的利用率
     3.改善程序结构。将既长又复杂的进程分为多个线程，独立运行，利于理解和修改

 * 多线程的创建，方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写 Thread 的run()方法 ---> 将此线程的方法声明在run()中
 * 3.创建 Thread 类的子对象
 * 4.通过此对象调用start()
 *
 * 例子:遍历 100 以内的所有的偶数
 */

    //1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写Thread类的run()方法
    @Override
    public void run() {
        for(int i = 1;i < 100;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子对象
        MyThread t1 = new MyThread();
        //4.通过此对象调用start():①启动当前线程； ②调用当前线程的run()
        t1.start();
        //如下操作仍在main线程中执行的
        for(int i = 1;i < 100;i++){
            if(i % 2 == 0){
                System.out.println(i + "***main()***");
            }
        }


    }
}
