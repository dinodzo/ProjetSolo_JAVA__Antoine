/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMysql {
    
    public Connection connect = null;
    public Statement statement = null;
    public ResultSet resultset = null;
    
    public void mainConnection()throws Exception {
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=SQLdino&password=azerty");
            statement = connect.createStatement();
            resultset = statement.executeQuery("SELECT * FROM tabletest");
            System.out.print("! Connection BDD !");    

            while (resultset.next()){
                System.out.println("ID TEST: " + resultset.getInt("ID" + "TXT TEST: " + resultset.getString("TXT")));
            }
        } 
        
        catch (SQLException ex) 
        {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
}