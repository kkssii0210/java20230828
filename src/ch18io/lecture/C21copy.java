package ch18io.lecture;

import java.io.*;

public class C21copy {
    public static void main(String[] args) {
        File inputFile = new File("C:/Temp/g70.jpg");
        File outputFile = new File("C:/Temp/destination.jpg");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
