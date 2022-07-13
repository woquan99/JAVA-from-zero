package Shangguigu.multiThread.exercise1;

/**
 * 创建两个分线程，其中一个遍历100以内的偶数，另一个遍历100以内的奇数
 *
 */

public class ThreadDemo1 {
    public static void main(String[] args){

        // 创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run(){
                for(int i = 0;i < 100;i++){
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                for(int i = 0;i < 100;i++){
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();


    }
}
