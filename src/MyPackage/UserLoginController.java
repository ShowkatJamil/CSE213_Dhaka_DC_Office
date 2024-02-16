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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author showk
 */
public class UserLoginController implements Initializable {

    @FXML    private TextField loginIdTextField;
    @FXML    private TextField passwordTextField;
    @FXML    private Label idOrPasswordIsWrongOutputLabel;
    @FXML    private Label invalidIdOutputLabel;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML    public Label passwordChangeOrIdcreateNotificationOutputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        userTypeComboBox.getItems().addAll("DC", "UNO", "Citizen", "District Magistrate", "AC Land",
                                            "AC Tax", "Administrative Assistant","DRRO");
    }    

    @FXML
    private void forgotPasswordButtonOnClick(ActionEvent event) throws IOException {
           Parent parent = FXMLLoader.load(getClass().getResource("ForgotPassword.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void newCitizenSigninButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("NewCitizenUserSignin.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    
}
