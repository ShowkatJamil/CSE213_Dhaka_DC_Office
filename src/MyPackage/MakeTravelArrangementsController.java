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
 * @author Le PC
 */
public class MakeTravelArrangementsController implements Initializable {

    @FXML
    private ComboBox<?> modeOfTransportComboBox;
    @FXML
    private TextField startFromRoadNoTextField;
    @FXML
    private TextField startFromAreaTextField;
    @FXML
    private TextField startFromCityTextField;
    @FXML
    private TextField toRoadNoTextField;
    @FXML
    private TextField toAreaTextField;
    @FXML
    private TextField toCityTextField;
    @FXML
    private ComboBox<?> serviceProviderComboBox;
    @FXML
    private Label totalExpenseLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("AdministrativeAssistantDashboard.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void confirmButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AdministrativeAssistantDashboard.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    
}
