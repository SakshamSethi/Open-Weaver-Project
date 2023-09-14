package com.java.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
            
         if(con==null) 
         {
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrary", "root", "saksham123");
            
            
         }
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
}
}
