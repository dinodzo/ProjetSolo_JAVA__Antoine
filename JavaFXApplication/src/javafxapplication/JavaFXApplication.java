/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication;

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
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        System.out.print("TEST LOADING");       
    }

   
    public static void main(String[] args) {    
        
        ConnectMysql connection = new ConnectMysql();
        try
            {
                connection.mainConnection();
            }
        catch (Exception e)
            {
                System.out.println(e);
            }
        launch(args);
    }
    
}
