package JavaNIO.atguigu_nio.channel;

import java.io.RandomAccessFile;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

//通道之间数据传输
public class FileChannelDemo4 {

//    ServerSocketChannel
    // transferTo()
    public static void main(String[] args) throws Exception {
        // 创建两个fileChannel
        RandomAccessFile aFile = new RandomAccessFile("F:\\IDEA Data\\src\\hello1.txt","rw");
        FileChannel fromChannel = aFile.getChannel();

        RandomAccessFile bFile = new RandomAccessFile("F:\\IDEA Data\\src\\hello3.txt","rw");
        FileChannel toChannel = bFile.getChannel();

        //fromChannel 传输到 toChannel
        long position = 0;
        long size = fromChannel.size();
        fromChannel.transferTo(0,size,toChannel);

        aFile.close();
        bFile.close();
        System.out.println("over!");
    }
}
