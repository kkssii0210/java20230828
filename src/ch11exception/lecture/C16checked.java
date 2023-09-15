package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C16checked {
    public static void main(String[] args) {
        try {
            var input = new FileInputStream("file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
