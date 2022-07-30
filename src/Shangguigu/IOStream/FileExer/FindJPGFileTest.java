package Shangguigu.IOStream.FileExer;

import org.junit.Test;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 2.判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 */

public class FindJPGFileTest {
    @Test
    public void test(){
        File srcfile  = new File("C:\\Users\\偓佺\\Pictures\\Camera Roll");
        String[] filenames = srcfile.list();
        for(String filename : filenames){
            if(filename.endsWith(".jpg")){
                System.out.println(filename);
            }
        }
    }

    @Test
    public void test2(){
        File srcfile  = new File("C:\\Users\\偓佺\\Pictures\\Camera Roll");
        File[] listfiles = srcfile.listFiles();
        for(File file:listfiles){
            if(file.getName().endsWith(".jpg")){
                System.out.println(file.getAbsolutePath());
            }
        }
    }


    /**
     * File类提供了两个文件过滤器方法
     * public String[] list(FilenameFilter filter)
     * public File[] listFiles(FileFilter filter)
     */
    @Test
    public void test3(){
        File srcFile = new File("C:\\Users\\偓佺\\Pictures\\Camera Roll");

        File[] subFiles = srcFile.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for(File file : subFiles){
            System.out.println(file.getAbsolutePath());
        }
    }

}
