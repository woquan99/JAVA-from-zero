package Shangguigu.IOStream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * Java程序中，对于数据的输入/输出操作以“流(stream)”的方式进行。
 * java.io包下提供了各种“流”类和接口，用以获取不同种类的数据，并通过标准的方法输入或输出数据。
 * 输入input：读取外部数据（磁盘、光盘等存储设备的数据）到程序（内存）中。
 * 输出output：将程序（内存）数据输出到磁盘、光盘等存储设备中。
 *
 * 一、流的分类：
 * 1.操作数据单位：字节流(InputStream/OutputStream)、字符流(Reader/Writer)
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 *
 * 二、流的体系结构
 * 抽象基类         节点流（或文件流）                                  缓冲流（处理流的一种）
 * InputStream     FileInputStream   (read(byte[] buffer))        BufferedInputStream (read(byte[] buffer))
 * OutputStream    FileOutputStream  (write(byte[] buffer,0,len)  BufferedOutputStream (write(byte[] buffer,0,len) / flush()
 * Reader          FileReader (read(char[] cbuf))                 BufferedReader (read(char[] cbuf) / readLine())
 * Writer          FileWriter (write(char[] cbuf,0,len)           BufferedWriter (write(char[] cbuf,0,len) / flush()
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("F:\\IDEA Data\\src\\hi.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());

        File file1 = new File("F:\\IDEA Data\\src\\hello1.txt");
        System.out.println(file1.getAbsolutePath());
    }

    /**
     * hello1.txt文件内容读入程序中，并输出到控制台
     *
     * 说明点：
     *     1. read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
     *     2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
     *     3. 读入的文件一定要存在，否则就会报 FileNotFoundException。
     *
     */
    @Test
    public void test(){
        FileReader fr = null;
        try {
            //实例化File对象，指明要操作的文件
            File file = new File("F:\\IDEA Data\\src\\hello1.txt");//相较于当前的Module
            //2.提供具体的流
            fr = new FileReader(file);

            //3.数据的读入过程
            //read():返回读入的一个字符。如果达到文件末尾，返回-1.
            int data;
            while((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.流的关闭操作
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    //对read()操作升级：使用read的重载方法
    @Test
    public void test2(){
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("F:\\IDEA Data\\src\\hello1.txt");

            //2.FileReader流的实例化
            fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数。如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            fr.read(cbuf);
            while((len = fr.read(cbuf)) != -1){
                //方式一：
                //错误的写法
//                for(int i = 0;i < cbuf.length;i++){
//                    System.out.print(cbuf[i]);
//                }
                //正确的写法
                for(int i = 0;i < len;i++){
                    System.out.print(cbuf[i]);
                }

                //方式二：
                //错误的写法,对应着方式一的错误的写法
//                String str = new String(cbuf);
//                System.out.print(str);
                //正确的写法
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fr != null){
                //4.资源的关闭
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }


}
