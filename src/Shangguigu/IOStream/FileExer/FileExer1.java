package Shangguigu.IOStream.FileExer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 1. 利用File构造器，new一个文件目录file
 *    1)在其中创建多个文件和目录
 *    2)编写方法，实现删除file中指定文件的操作
 */
public class FileExer1 {
    @Test
    public void test() throws IOException{
        File fileExer = new File("F:\\IDEA Data\\src\\hello.txt");
        File fileExer1 = new File(fileExer.getParent(),"hello1.txt");
        boolean newFile = fileExer1.createNewFile();
        if(newFile){
            System.out.println("创建成功！");
        }

    }
}
