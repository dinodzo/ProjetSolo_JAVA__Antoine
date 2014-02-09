/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Dinodzo
 */

public class Connection {
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/test";
    String user = "root";
    String password = "azerty";
   
    String q = "SELECT * from tabletest";
   
    try {
        java.sql.Connection con = DriverManager.getConnection( url, user, password);
    Statement stmt = con.createStatement();
   
    stmt.executeQuery(q);
   
    } catch (SQLException ex) {
        System.out.println("Echec connection!!" );
    }
   
    }
}
