package Shangguigu.multiThread.ThreadPool;

import java.util.concurrent.*;

/**
 * 创建多线程的方式四：使用线程池
 *
 * 好处：
 *      1.提高响应速度（减少了创建新线程的时间）
 *      2.降低资源消耗（重复利用线程池中线程，不需要每次都创建）
 *      3.便于线程管理
 *      4.
 *          corePoolSize：核心池的大小
 *          maximumPoolSize：最大线程数
 *          keepAliveTime：线程没有任务时最多保持多长时间后会终止
 *
 * 同步监视器（锁）：是一个对象
 * synchronized(同步监视器){
 *     // 含操作共享数据的代码(不能包括多了，也不能少了)
 * }
 *
 * 面试题：创建多线程有几种方式？四种！
 * extends Thread\implements Runnable\implements Callable\ThreadPool
 *
 *
 */

class NumberThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i <= 100;i++){
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {

        /**
        //1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的属性
//        System.out.println(service.getClass());
//        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();

        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());  //适合适用于Runable
        service.execute(new NumberThread1());  //适合适用于Runable

//        service.submit(Callable callable);   //适合适用于Callable

        //3.关闭连接池
        service.shutdown();
*/

        // https://www.bilibili.com/video/BV1dt4y1i7Gt?spm_id_from=333.337.search-card.all.click&vd_source=91211cefb2d76928834c98d5a52cb7bb
        // 上面的视频是对应下面的代码，视频名：面试官求放过，快被问烂的线程池，二十分钟给你讲的明明白白
        ExecutorService executorService = new ThreadPoolExecutor(3,5,1l,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(3),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy() );
        for(int i =0;i<9;i++){
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+"===>办理业务");
            });

        }
    }
}

