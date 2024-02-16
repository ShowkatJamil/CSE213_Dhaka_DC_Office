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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Le PC
 */
public class AdministrativeAssistantDashboardController implements Initializable {

    @FXML
    private TextArea userPromptMessageTextArea;
    @FXML
    private ComboBox<String> userDesignationComboBox;
    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField verificationCodeTextField;
    @FXML
    private TextField userIDTextField;
    @FXML
    private DatePicker userDOBDatePicker;
    @FXML
    private DatePicker userDOJDatePicker;
    @FXML
    private TextField userEmailTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void respondToRequestsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void makeTravelArrangementsButtonOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("MakeTravelArrangements.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void checkOfficeSuppliesButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void createOrUpdateButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void promptForFeedbackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void createNewUserButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void sendMeetingNoticeButtonOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("SendNoticeScene.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    
}
