package JavaNIO.atguigu_nio_chat.client;

import java.io.IOException;

public class CClient {

    public static void main(String[] args) {
        try {
            new ChatClient().startClient("Woquan");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
