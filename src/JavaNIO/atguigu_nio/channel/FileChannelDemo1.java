package JavaNIO.atguigu_nio.channel;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *  FileChannel 读取数据到 buffer 中
 */
public class FileChannelDemo1 {

    public static void main(String[] args) throws Exception {
        // 创建 FileChannel
        RandomAccessFile aFile = new RandomAccessFile("F:\\IDEA Data\\src\\hello1.txt","rw");
        FileChannel channel = aFile.getChannel();

        // 创建 Buffer
        ByteBuffer buf = ByteBuffer.allocate(1024);

        // 实际从channel中读取的字节数
        int bytesRead = channel.read(buf);

        // 读取数据到 Buffer 中
        while(bytesRead != -1) {
            System.out.println("读取了："+bytesRead);
            // buffer.flip()反转读写模式,从缓冲区读取数据
            buf.flip();
            while(buf.hasRemaining()) {
                System.out.println((char)buf.get());
            }
            // 调用 buffer.clear()或 buffer.compact()清除缓冲区内容
            buf.clear();
            bytesRead = channel.read(buf);
        }
        aFile.close();
        System.out.println("结束了");
    }
}
