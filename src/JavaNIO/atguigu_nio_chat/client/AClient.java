package JavaNIO.atguigu_nio_chat.client;

import java.io.IOException;

public class AClient {

    public static void main(String[] args) {
        try {
            new ChatClient().startClient("Alice");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
