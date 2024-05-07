/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtbcourse.Controller;

/**
 *
 * @author ngoqu
 */

import dtbcourse.Model.databaseInit;
import java.sql.*;

public class databaseConnection {
    public databaseInit db;
    public databaseConnection() {
        db = new databaseInit();
   }
    
    private static String DB_URL = "jdbc:mysql://localhost:3306/users";
    private static String USER_NAME = "root";
    private static String PASSWORD = "root";
       public boolean register(String username,String password,String confirmPassword)
   {
       
        if (!password.equals(confirmPassword)) {
            
            return false;
        }
        try {
            db = new databaseInit();
            if(db!=null)
            {
                db.dtbConnect(DB_URL, USER_NAME, PASSWORD);
                try (PreparedStatement pstm = db.conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)")) {
                pstm.setString(1, username);
                pstm.setString(2, password);
                int rowInserted = pstm.executeUpdate();
                return rowInserted > 0;
            }
           
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return false;
   }
       public boolean login(String username,String password)
       {
          try
          {
               db = new databaseInit();
              if(this.db!=null)
              {
                  db.dtbConnect(DB_URL, USER_NAME, PASSWORD);
                 try(PreparedStatement statement = db.conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?")) 
              {
                statement.setString(1, username);
                statement.setString(2, password);
                try (ResultSet rs = statement.executeQuery())
                {
                return rs.next();
                }
              }
              }
           }
          catch (SQLException e) 
          {
            e.printStackTrace();
            return false;
            }
          finally {
      
        if (db != null) {
            db.closeConnection();
        }
        }   
      return false;
}
}
