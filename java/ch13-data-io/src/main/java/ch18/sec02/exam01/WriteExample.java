package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class WriteExample {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = 30;
        try {
            OutputStream os = new FileOutputStream("c:/temp/test1.db");

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
