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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ScheduleHearingController implements Initializable {

    @FXML
    private AnchorPane scheduleHearingAnchorPane;
    @FXML
    private TableView<?> scheduledHearingsTableView;
    @FXML
    private TableColumn<?, ?> applicantIdColumn;
    @FXML
    private TableColumn<?, ?> khatianNoColumn;
    @FXML
    private TableColumn<?, ?> presentPossessorColumn;
    @FXML
    private TableColumn<?, ?> dateColumn;
    @FXML
    private TableColumn<?, ?> timeColumn;
    @FXML
    private ComboBox<?> hourComboBox;
    @FXML
    private DatePicker hearingDatePicker;
    @FXML
    private ComboBox<?> amPmComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landHearingParent = FXMLLoader.load(getClass().getResource("GrantHearingDate.fxml"));
        Scene hearing = new Scene(landHearingParent);
        
        Stage stglandhearing = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stglandhearing.show();
        stglandhearing.setScene(hearing);
    }

    @FXML
    private void exitToDashboardButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landDashboardParent = FXMLLoader.load(getClass().getResource("ACLandDashboard.fxml"));
        Scene dashboard = new Scene(landDashboardParent);
        
        Stage landdashstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        landdashstg.show();
        landdashstg.setScene(dashboard);
        
    }

    @FXML
    private void scheduleHearingButtonOnClick(ActionEvent event) {
    }
    
}
