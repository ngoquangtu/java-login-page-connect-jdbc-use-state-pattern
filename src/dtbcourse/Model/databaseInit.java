/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtbcourse.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author ngoqu
 */
public class databaseInit {

    
   public Connection conn;
   public Statement stm;
   public PreparedStatement pstm;
   
   public databaseInit()
   {
       
   }
   
   public boolean dtbConnect(String url,String username,String password)
   {
       boolean ret=false;
       try
       {
           this.conn=DriverManager.getConnection(url,username,password);
           if(this.conn!=null)
           {
               ret=true;
               this.stm=this.conn.createStatement();
               
           }
       }
       catch (SQLException var6) {
         System.out.println("Cannot Connect to database!" + var6.toString());
      }    
       return ret;  
   }
       public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing the database connection: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

