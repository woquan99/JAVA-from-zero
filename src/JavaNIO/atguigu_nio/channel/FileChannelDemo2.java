package JavaNIO.atguigu_nio.channel;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * FileChannel写操作
 */
public class FileChannelDemo2 {

    public static void main(String[] args) throws Exception {
        // 创建 FileChannel
        RandomAccessFile aFile = new RandomAccessFile("F:\\IDEA Data\\src\\hi.txt","rw");
        FileChannel channel = aFile.getChannel();

        // 创建 buffer 对象
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.clear();

        // 写入内容
        String newData = "data ying";
        buffer.put(newData.getBytes());
        buffer.flip();

        // FileChannel完成最终实现
        // 注意 FileChannel.write()是在 while 循环中调用的。因为无法保证 write() 方法一次能
        // 向 FileChannel 写入多少字节，因此需要重复调用 write() 方法，直到 Buffer 中已经没
        // 有尚未写入通道的字节。
        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }

        //关闭
        channel.close();
    }
}
