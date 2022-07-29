package Shangguigu.NetworkProgramming;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * UDP协议的网络编程
 */

public class UDPTest {

    // 发送端
    @Test
    public void sender() throws IOException {
        // 1.建立UDP的socket
        DatagramSocket socket = new DatagramSocket();
        // 2.发送的字符串
        String str = "UDP发送端";
        byte[] data = str.getBytes();
        // 3.得到IP地址
        InetAddress inet = InetAddress.getLocalHost();
        // 4.创建UDP包
        DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,8888);
        // 5.发送UDP包
        socket.send(packet);
        socket.close();
    }
    // 接收端
    @Test
    public void receiver()  throws IOException {
        // 1.建立含端口的socket
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
