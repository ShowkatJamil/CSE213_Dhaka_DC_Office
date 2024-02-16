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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author showk
 */
public class NewCitizenUserSigninController implements Initializable {

    @FXML    private Label newUserIdOutputLabel;
    @FXML    private TextField newUserPhoneNumberTextField;
    @FXML    private TextField newPasswordTextField;
    @FXML    private TextField confirmPasswordTextField;
    @FXML    private TextField newUserNidNoTextField;
    @FXML    private DatePicker newUserDob;
    @FXML    private TextField newUserNameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createUserAccountButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setScene(scene);
        stg.show();
    }
    
}
