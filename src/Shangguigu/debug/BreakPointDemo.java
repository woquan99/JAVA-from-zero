package Shangguigu.debug;

import Shangguigu.oop.middle.class2.Person;
import Shangguigu.oop.middle.class2.Student;

public class BreakPointDemo {
    // 行断点
    public static void line(){
        System.out.println("this is the line break point！");
    }
    // 详细断点（源断点）
    public static void detailLine(){
        System.out.println("this is the detail line break point！");
    }
    // 方法断点 | 接口跳转实现类
//    public static void method(){
//        System.out.println("this is from method!");
//        IService iservice = new IServiceImpl();
//        iservice.execute();
//    }
    // 异常断点 | 全局捕获
    public static void exception(){
        Object o = null;
        o.toString();
        System.out.println("this is line will never be print！");
    }

    // 字段断点 | 读写监控
    public static void field(){
        Person p = new Person("field",10);
        System.out.println(p);
    }

    public static void main(String[] args){
//        line();
        detailLine();
//        method();
//        exception();
//        field();
    }

}
