package Shangguigu.IOStream.Serializable;

import org.junit.Test;

import java.io.*;


/**
 * 对象流的使用
 * 1.ObjectInputStream 和 ObjectOutputStream
 *
 * 2.作用：用于存储和读取基本数据类型数据或对象的处理流。它的强大之处就是可以把 Java 中的对象写入到数据源中，也能把对象从数据源中还原回来。
 *
 * 3.要想一个 Java 对象是可序列化的，需要满足相应的要求。见 Person.java
 *
 * 4.序列化机制：
 * 对象序列化机制允许把内存中的 Java 对象转换成平台无关的二进制流，从而允许把这种
 * 二进制流持久地保存在磁盘上，或通过网络将这种二进制流传输到另一个网络节点。
 * 当其它程序获取了这种二进制流，就可以恢复成原来的 Java 对象。
 *
 */
public class ObjectTest {

    /**
     * 序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
     * 使用 ObjectOutputStream 实现
     */
    @Test
    public void test(){
        ObjectOutputStream oos = null;
        try {
            // 1.创造流
            oos = new ObjectOutputStream(new FileOutputStream("F:\\IDEA Data\\src\\object1.dat"));
            // 2.制造对象
            oos.writeObject(new String("滕王阁欢迎你"));
            // 3.刷新操作
            oos.flush();

            oos.writeObject(new Person("李时珍",65));
            oos.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                //3.关闭流
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 反序列化：将磁盘文件中的对象还原为内存中的一个 Java 对象
     * 使用 ObjectInputStream 来实现
     */
    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("F:\\IDEA Data\\src\\object1.dat"));

            Object obj = ois.readObject();
            String str = (String) obj;

            Person p = (Person) ois.readObject();

            System.out.println(str);
            System.out.println(p);
            System.out.println(p.getName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


class Person implements Serializable {
    public static final long serialVersionUID = 4815151541105l;
    private String name;
    private int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}