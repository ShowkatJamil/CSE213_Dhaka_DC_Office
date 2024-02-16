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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Le PC
 */
public class SendNoticeMeetingScheduleController implements Initializable {

    @FXML
    private DatePicker meetingDateDatePicker;
    @FXML
    private TextField meetingTimeHourTextField;
    @FXML
    private RadioButton amRadioButton;
    @FXML
    private RadioButton pmRadioButton;
    @FXML
    private Label clashScheduleMessageLabel;
    @FXML
    private TextField meetingTimeMinTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void scheduleCompabilityButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("SendNoticeScene.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("SendNoticeMeetingScheduleRoomSelectionScene.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    
}
