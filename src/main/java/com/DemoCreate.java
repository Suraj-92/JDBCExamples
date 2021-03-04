package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoCreate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded...");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoExample","root","root");
        System.out.println("Connected...");

        Statement st = con.createStatement();
        boolean x = st.execute("create table stud_info (rno int, name varchar(20), address varchar(100), result Float, primary key(rno))");
        if (x)
        {
            System.out.println("Fail..");
        }
        else {
            System.out.println("Success....");
        }
    con.close();
    }
}
