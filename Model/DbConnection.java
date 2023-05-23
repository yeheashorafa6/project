/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DbConnection {
     private static DbConnection db=null;
    private DbConnection(){
        
    }
    
    public static DbConnection getInstance(){
        if (db == null) {
            db = new DbConnection();
            return db;
        }else{
           return db; 
        }
    }
    
    public Connection getConnection() throws SQLException{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_appointments","root","");
        return c;
    }
}
