package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	// write your code here
    try{Class.forName("com.mysql.cj.jdbc.Driver");
        Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3305/maryam","root","");
        Statement S = C.createStatement();
        ResultSet R = S.executeQuery("SELECT * FROM school");


        while (R.next()) {
            System.out.print(R.getInt("RegNo") + " ");
            System.out.print(R.getString("Name") + " ");
            System.out.println(R.getInt("Marks") + " ");

        }

       S.executeUpdate("INSERT into school VALUES (3,'Shafeeq',150)");


    }
    catch(Exception e)
    {
        System.out.println(e);
    }



    }
}
