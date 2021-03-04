package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded...");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoExample","root","root");
        System.out.println("Connected...");

        PreparedStatement pst = con.prepareStatement("insert into Emp_info values (?, ?, ?, ?)");
        pst.setInt(1,101);
        pst.setString(2,"Suraj");
        pst.setString(3,"Delhi");
        pst.setFloat(4,900000);
        int x = pst.executeUpdate();
        if (x>0)
        {
            System.out.println("Success....");
        }
        else {
            System.out.println("Fail...");
        }
        con.close();
    }
}
