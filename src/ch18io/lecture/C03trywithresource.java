package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1() {
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {

        try (OutputStream os = new FileOutputStream("")) {
            os.write(33);
            os.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void method3() {
        try (FileOutputStream fos = new FileOutputStream(""); FileInputStream fis = new FileInputStream("");) {
            fos.write(234);
            fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4() {
        Scanner scanner = new Scanner("");
        try (scanner) {
            scanner.hasNext();
            scanner.next();
        }
    }
}
