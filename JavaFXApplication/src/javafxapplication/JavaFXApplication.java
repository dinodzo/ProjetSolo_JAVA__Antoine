/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dinodzo
 */
public class JavaFXApplication extends Application {
    
        private Connection connect = null;
        //private Statement statement = null;
        //private PreparedStatement preparedStatement = null;
        //private ResultSet resultSet = null;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        System.out.print("TEST LOADING");
        
// Try 2:
        
        try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                connect = (Connection) DriverManager
                .getConnection("jdbc:mysql://localhost/test?"
                + "user=root&password=azerty");

                String Req = "SELECT * from tabletest";       
            } 
        catch (SQLException ex) 
            {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }

        
        
        
        
//    Try1: CONNECTION + REQ -> Bug ?????     
//
//    try 
//        {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//        } 
//    catch (Exception ex) 
//        {
//            System.out.println("   Connection:"+"Echec connection!" );
//        }
//
//    String url = "jdbc:mysql://localhost/test";
//    String user = "root";
//    String password = "azerty";
//    String Req = "SELECT * from tabletest";
//
//    try 
//        {
//            java.sql.Connection con = DriverManager.getConnection( url, user, password);
//            Statement stmt = con.createStatement();
//            stmt.executeQuery(Req);
//        } 
//    catch (SQLException ex) 
//        {
//            System.out.println("   Execute Req:"+"Echec connection!" );
//        }
        
        
        
        
        
        
        
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
       
        launch(args);
    }
    
}
