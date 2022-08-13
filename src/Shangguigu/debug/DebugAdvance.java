package Shangguigu.debug;

import Shangguigu.oop.middle.class2.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 断点调试：进阶
 */

public class DebugAdvance {
    //
    public static void printStackTrace(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
    // 表达式解析
    public static void evaluate(){
        System.out.println("evaluate");
        Person p = new Person("woquan",23);
        List<Integer> list = Arrays.asList(1,2,3,4).stream()
                        .map(x -> x*2).collect(Collectors.toList());
    }

    // 避免操作资源 | drop frames
    public static void saveRecourse(){
        System.out.println("shit happens");

        System.out.println("save to db");
        System.out.println("save to redis");
        System.out.println("send message to mq for money payout");
    }

    // 快捷键、图标含义
    public static void keysExplain(){
        System.out.println("keys");
        // step over
        System.out.println("step over");
        // step into | step out
        System.out.println("step into | step out");
        IService service = new IServiceImpl();
        service.execute();
    }

    // 调试源码 | JDK
    public static void sourceCode(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.size());

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.size());

    }


    // stream 调试
    public static void streamDebug(){
        // stream chain
        Arrays.asList(1,2,3,45).stream()
                .filter(i -> i%2==0 || i%3==0)
                .map(i -> i*i)
                .forEach(System.out::print);

        // evaluate 曲线救国
        String string = Optional.of("hi,")
                .map(e -> e+"java")
                .map(e -> e+"技术")
                .map(e -> e+"栈").get();
        System.out.println(string);

    }

    public static void main(String[] args){
//        printStackTrace();
//        evaluate();
//        saveRecourse();
//        keysExplain();
//        sourceCode();
        streamDebug();


    }
}
