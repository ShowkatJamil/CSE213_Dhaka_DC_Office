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
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author showk
 */
public class AllotmentOfVehiclesToDifferentOfficesController implements Initializable {

    @FXML    private Label userIdOutputLabel;
    @FXML    private Label availableVehiclesOutputLabel;
    @FXML    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> deptNameCollumn;
    @FXML
    private TableColumn<?, ?> allotmentReasonCollumn;
    @FXML
    private TableColumn<?, ?> carAmountCollumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
    Parent parent = FXMLLoader.load(getClass().getResource("DeputyCommisionerDashboard.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void selectAllButtonOnClick(ActionEvent event) throws IOException {
    
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) throws IOException {
      Parent parent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
}
