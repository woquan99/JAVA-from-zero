package Shangguigu.IOStream.FileExer;

import org.junit.Test;
import java.io.File;
import java.io.FileFilter;

/**
 * 2.判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 */

public class FindJPGFileTest {
    @Test
    public void test(){
        File srcfile  = new File("F:\\IDEA Data\\src\\Shangguigu");
        String[] filenames = srcfile.list();
        for(String filename : filenames){
            if(filename.endsWith(".jpg")){
                System.out.println(filename);
            }
        }
    }

    @Test
    public void test2(){
        File srcfile  = new File("F:\\IDEA Data\\src\\Shangguigu");
        File[] listfiles = srcfile.listFiles();
        for(File file:listfiles){
            if(file.getName().endsWith(".jpg")){
                System.out.println(file.getAbsolutePath());
            }
        }
    }


}
