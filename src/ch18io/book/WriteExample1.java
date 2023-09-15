package ch18io.book;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test2.db")) {
            byte[] array = {10, 20, 30};

            os.write(array);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
