package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C08read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";
        int read;
        int read1;
        int read2;
        int read3;
        int read4;
        try (InputStream is = new FileInputStream(file)) {
            byte[] arr = new byte[3];

            read = is.read(arr);
            read1 = is.read(arr);
            read2 = is.read(arr);
            read3 = is.read(arr);
            read4 = is.read(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("read = " + read);
        System.out.println("read1 = " + read1);
        System.out.println("read2 = " + read2);
        System.out.println("read3 = " + read3);
        System.out.println("read4 = " + read4);

    }
}
