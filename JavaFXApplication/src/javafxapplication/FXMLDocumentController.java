 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

 /**
 *
 * @author Dinodzo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    public void ClickTEST(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
//    @FXML
//    private Label LiAjLabel;
//    
//    @FXML
//    private TextField LiAjNom;
//    
//    @FXML
//    private TextField LiAjImage;
//    
//    @FXML
//    private TextField LiAjThem;
//    
//    @FXML
//    private TextField LiAjDesc;
//    
//    @FXML
//    private TextField LiAjHT;
//    
//    @FXML
//    private TextField LiAjAI;
//    
//    @FXML
//    private TextField LiModNom;
//    
//    @FXML
//    private TextField LiModImage;
//    
//    @FXML
//    private TextField LiModThem;
//    
//    @FXML
//    private TextField LiModDesc;
//    
//    @FXML
//    private TextField LiModHT;
//    
//    @FXML
//    private TextField LiModAI;
//    
//    @FXML
//    private ComboBox LiModCB;
//    
//    @FXML
//    private ComboBox LiSupCB;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
