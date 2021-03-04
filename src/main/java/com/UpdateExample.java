package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded...");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoExample","root","root");
        System.out.println("Connected...");
        PreparedStatement pst = con.prepareStatement("update Emp_info set city = ? where id = ?");
        pst.setString(1,"Mumbai");
        pst.setInt(2,101);
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
