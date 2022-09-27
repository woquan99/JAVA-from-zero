package com.atguigu.asyncfilechannel;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

public class AsyncFileChannelDemo {


    @Test
    public void writeAsyncFileComplate() throws IOException {
        //1 创建AsynchronousFileChannel
        Path path = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\asyncfilechannel\\AsyncFile.txt");
        AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.WRITE);

        //2 创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        //3 write方法
        buffer.put("WoquanTest2".getBytes());
        buffer.flip();

        fileChannel.write(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                System.out.println("bytes written: " + result);
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {

            }
        });

        System.out.println("write over");
    }

    @Test
    public void writeAsyncFileFuture() throws IOException {
        //1 创建AsynchronousFileChannel
        Path path = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\asyncfilechannel\\AsyncFile.txt");
        AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.WRITE);

        //2 创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        //3 write方法
        buffer.put("WoquanTest".getBytes());
        buffer.flip();
        Future<Integer> future = fileChannel.write(buffer, 0);

        while (!future.isDone()) ;

        buffer.clear();
        System.out.println("write over");
    }


    /**
     * 通过 CompletionHandler 读取数据
     */
    @Test
    public void readAsyncFileChannelComplate() throws Exception {
        //1 创建AsynchronousFileChannel异步文件通道对象
        Path path = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\asyncfilechannel\\AsyncFile.txt");
        AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

        //2 创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        //3 调用 channel 的 read 方法得到 Future
        fileChannel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {

            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                System.out.println("result: " + result);
                attachment.flip();
                byte[] data = new byte[attachment.limit()];
                attachment.get(data);
                System.out.println(new String(data));
                attachment.clear();
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
            }
        });
    }


    /**
     * 通过 Future 读取数据
     */
    @Test
    public void readAsyncFileChannelFuture() throws Exception {
        //1 创建AsynchronousFileChannel
        Path path = Paths.get("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\asyncfilechannel\\AsyncFile.txt");
        AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

        //2 创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        //3 调用channel的read方法得到Future
        Future<Integer> future = fileChannel.read(buffer, 0);

        //4 判断是否完成 isDone,返回true
        while (!future.isDone()) ;

        //5 读取数据到buffer里面
        buffer.flip();
//        while(buffer.remaining()>0) {
//            System.out.println(buffer.get());
//        }// 这种方法输出的是Unicode值，而不是文本中的内容
        byte[] data = new byte[buffer.limit()];
        buffer.get(data);// buffer的内容传入了data中
        System.out.println(new String(data));
        buffer.clear();

    }


}
