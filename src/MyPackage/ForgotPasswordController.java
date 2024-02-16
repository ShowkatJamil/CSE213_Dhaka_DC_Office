/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author showk
 */
public class ForgotPasswordController implements Initializable {

    @FXML    private TextField userIdTextField;
    @FXML    private TextField phoneNumberTextField;
    @FXML    private TextField verificationCodeTextField;
    @FXML    private Label invalidCodeOutputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getCodeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("ForgotPassword2.fxml"));
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void previousButtonOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setScene(scene);
        stg.show();
    }
    
}
