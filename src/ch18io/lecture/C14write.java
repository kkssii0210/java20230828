package ch18io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C14write {
    public static void main(String[] args) {
        String file = "C:/Temp/out7.txt";
        try(Writer writer = new FileWriter(file)) {
            char[] chars = {'손','흥','민','이','강','인'};
            writer.write(chars);

            writer.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
