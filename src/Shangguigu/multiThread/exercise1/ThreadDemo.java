package Shangguigu.multiThread.exercise1;

public class ThreadDemo {
    public static void main(String[] args){
    MyThread t1 = new MyThread();
    t1.start();
    MyThread1 t2 = new MyThread1();
    t2.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}