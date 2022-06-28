package Shangguigu.oop.up.exer4;

import java.util.Arrays;

public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Jane", "Smith");
        bank.getCustomers(0).setAccount(new Account(2000));
        bank.getCustomers(0).getAccount().withdraw(500);
        bank.getCustomers(0).getAccount().deposit(780);
        double balance = bank.getCustomers(0).getAccount().getBalance();
        System.out.println("客户: " + bank.getCustomers(0).getFirstName() + "的账户余额为：" + balance);


        System.out.println("***************************");
        bank.addCustomer("万里", "杨");

        System.out.println("银行客户的个数为: " + bank.getNumberOfCustomers());

        // 数组转变为字符串
        String info = Arrays.toString(new int[]{1,2,3});
        System.out.println(info);

    }
}

