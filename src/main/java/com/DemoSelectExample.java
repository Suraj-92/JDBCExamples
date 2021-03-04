package com;

import java.sql.*;

public class DemoSelectExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded...");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoExample","root","root");
        System.out.println("Connected...");

        PreparedStatement pst = con.prepareStatement("select *from stud_info where rno = ?");
        pst.setInt(1,101);
        ResultSet rs = pst.executeQuery();
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+ " " + rs.getString(2)+
                    " " +rs.getString(3)+ " "+rs.getFloat(4));
        }
    con.close();
    }
}
