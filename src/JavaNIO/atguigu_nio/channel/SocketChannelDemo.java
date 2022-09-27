package JavaNIO.atguigu_nio.channel;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class SocketChannelDemo {

    public static void main(String[] args) throws Exception {
        // 写法一：创建SocketChannel
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("www.baidu.com", 80));
        // 写法二：
//        SocketChannel socketChanne2 = SocketChannel.open();
//        socketChanne2.connect(new InetSocketAddress("www.baidu.com", 80));

        // 设置阻塞和非阻塞
        socketChannel.configureBlocking(false);
//        socketChannel.configureBlocking(true);// 阻塞状态无法继续执行下述代码

        // 读操作
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        socketChannel.read(byteBuffer);
        socketChannel.close();
        System.out.println("read over");

    }

}
