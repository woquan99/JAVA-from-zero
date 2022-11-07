package JavaNIO.atguigu_nio_chat.client;

import java.io.IOException;

public class BClient {

    public static void main(String[] args) {
        try {
            new ChatClient().startClient("Bob");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
