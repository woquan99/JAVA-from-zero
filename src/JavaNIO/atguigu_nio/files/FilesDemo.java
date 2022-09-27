package com.atguigu.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FilesDemo {

    public static void main(String[] args) {
        //create Directory
//        Path path = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\files1");
//        try {
//            Path directory = Files.createDirectory(path);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //copy
//        Path path1 = Paths.get("d:\\atguigu\\01.txt");
//        Path path2 = Paths.get("d:\\atguigutest\\001.txt");
//        try {
//            Path copy = Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // move 重命名操作
//        Path sourcePath = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\files\\data.txt");
//        Path destinationPath = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\files\\data1.txt");
//
//        try {
//            Files.move(sourcePath, destinationPath,
//                    StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            //移动文件失败
//            e.printStackTrace();
//        }


        //delete
//        Path path = Paths.get("F:\\\\IDEA Data\\\\src\\\\JavaNIO\\\\atguigu_nio\\\\files\\\\data1.txt");
//        try {
//            Files.delete(path);
//        } catch (IOException e) {
//            // 删除文件失败
//            e.printStackTrace();
//        }


        Path rootPath = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\charset\\CharsetDemo.txt");
        String fileToFind = File.separator + "002.txt";

        try {
            Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    String fileString = file.toAbsolutePath().toString();
                    //System.out.println("pathString = " + fileString);

                    if(fileString.endsWith(fileToFind)){
                        System.out.println("file found at path: " + file.toAbsolutePath());
                        return FileVisitResult.TERMINATE;
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
