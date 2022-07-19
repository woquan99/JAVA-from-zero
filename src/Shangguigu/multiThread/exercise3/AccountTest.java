package Shangguigu.multiThread.exercise3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存 3 次。
 * 每次存完打印账户余额。
 * <p>
 * 分析：
 * 1.是否是多线程问题？是，两个储户线程
 * 2.是否有共享数据？有，账户（或账户余额）
 * 3.是否有线程安全问题？有
 * 4.需要考虑如何解决线程安全问题？同步机制：有三种方式。
 */
class Account {
    private double balance;

    // 创建构造器
    public Account(double balance) {
        this.balance = balance;
    }

    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    //存钱(方法一：采用synchronized)
//    public synchronized void deposit(double amt){ // 为防止出现问题，直接在public void deposit()前加上synchronized
//        if(amt > 0){
//
//            // 考虑线程安全
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            balance += amt;
//            System.out.println(Thread.currentThread().getName() + ":" + "存钱成功，当前余额:" + balance);
//        }
//    }

    // 存钱（方法二：采用lock）
    public void deposit(double amt) { // 为防止出现问题，直接在public void deposit()前加上synchronized
        try {
            lock.lock();
            if (amt > 0) {

                // 考虑线程安全
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                balance += amt;
                System.out.println(Thread.currentThread().getName() + ":" + "存钱成功，当前余额:" + balance);
            }
        } finally {
            lock.unlock();
        }
    }


}

class Customer extends Thread {

    private Account acct;

    // 创建构造器
    public Customer(Account acct) {
        this.acct = acct;
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}

