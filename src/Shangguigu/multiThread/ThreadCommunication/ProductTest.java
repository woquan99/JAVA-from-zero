package Shangguigu.multiThread.ThreadCommunication;

/**
 * 线程通信的应用：经典例题：生产者/消费者问题
 * <p>
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，
 * 店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；
 * 如果店中没有产品了，店员会告诉消费者等一下，
 * 如果店中有产品了再通知消费者来取走产品。
 * <p>
 * 分析：
 * 1.是否是多线程的问题？是，生产者的线程，消费者的线程
 * 2.是否有共享数据的问题？是，店员、产品、产品数
 * 3.如何解决线程的安全问题？同步机制，有三种方法
 * 4.是否涉及线程的通信？是
 */

class Clerk {
    private int productCount = 0;

    // 传递产品
    public synchronized void passProduct() throws InterruptedException {
        if (productCount < 20) {
            productCount++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + productCount + "个产品");
            notify();
        } else
            wait();
    }

    // 消费产品
    public synchronized void consumeProduct() throws InterruptedException {
        if (productCount > 0) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + productCount + "个产品");
            productCount--;
            notify();
        } else {
            wait();
        }
    }
}

class Producer extends Thread { //生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":开始生产产品...");
        while (true) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                clerk.passProduct(); // 生成方法的快捷键：Alt+Enter
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

class Consumer extends Thread {  //消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":开始消费产品...");
        while (true) {

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                clerk.consumeProduct(); // 生成方法的快捷键：Alt+Enter
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");
        Producer p2 = new Producer(clerk);
        p2.setName("生产者2");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");
        Consumer c2 = new Consumer(clerk);
        c2.setName("消费者2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}

