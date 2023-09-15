package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C15reader {
    public static void main(String[] args) {
        String path = "C:/Temp/out7.txt";
        try (Reader reader = new FileReader(path)) {
            int read = reader.read();
            char c1 = (char) read;
            int read1 = reader.read();
            char c2 = (char) read1;
            int read2 = reader.read();
            char c3 = (char) read2;

            System.out.println("read = " + read);
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println(c1+""+c2+c3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
