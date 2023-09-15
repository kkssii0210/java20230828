package ch11exception.lecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C22throws {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("","","");
        Class.forName("");
    }
}
