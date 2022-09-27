package JavaNIO.atguigu_nio.buffer;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class BufferDemo2 {

    static private final int start = 0;
    static private final int size = 1024;

    //内存映射文件io
     @Test
     public void b04() throws Exception {
         RandomAccessFile raf = new RandomAccessFile("F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\buffer\\RandomIOBuffer.txt", "rw");
         FileChannel fc = raf.getChannel();

         MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, start, size);

         mbb.put(0, (byte) 97);
         mbb.put(1, (byte) 122);
         raf.close();
     }

    //直接缓冲区
    @Test
    public void b03() throws Exception {
        String infile = "F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\buffer\\DirectBuffer.txt";
        FileInputStream fin = new FileInputStream(infile);
        FileChannel finChannel = fin.getChannel();

        String outfile = "F:\\IDEA Data\\src\\JavaNIO\\atguigu_nio\\buffer\\DirectBuffer1.txt";
        FileOutputStream fout = new FileOutputStream(outfile);
        FileChannel foutChannel = fout.getChannel();

        //创建直接缓冲区
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        while (true) {
            buffer.clear();
            // 把finChannel的内容写入buffer
            int r = finChannel.read(buffer);
            if(r == -1) {
                break;
            }
            buffer.flip();
            foutChannel.write(buffer);
        }
    }

    //只读缓冲区
    @Test
    public void b02() {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte)i);
        }

        // 创建只读缓冲区(这里面不能搞子缓冲区)
//        buffer.position(2); // 子缓冲区起始位置
//        buffer.limit(5); // 子缓冲区终止位置
        ByteBuffer readonly = buffer.asReadOnlyBuffer();

        for (int i = 0; i < buffer.capacity(); i++) {
            byte b = buffer.get(i);
            b *=10;
            buffer.put(i,b);
        }

        readonly.position(2);
        readonly.limit(buffer.capacity());

        while (readonly.remaining()>0) {
            System.out.println(readonly.get());
        }
    }


    //缓冲区分片
    @Test
    public void b01() {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte)i);
        }

        // 创建子缓冲区
        buffer.position(3); // 子缓冲区起始位置
        buffer.limit(7); // 子缓冲区终止位置
        ByteBuffer slice = buffer.slice();

        // 改变子缓冲区内容
        for (int i = 0; i <slice.capacity() ; i++) {
            byte b = slice.get(i);
            b *=10;
            slice.put(i,b);// i表示索引，b是值
        }

        buffer.position(2); // 更改读数据时的起始位置
        buffer.limit(buffer.capacity());

        while(buffer.remaining()>0) {
            System.out.println(buffer.get());
        }
    }
}
