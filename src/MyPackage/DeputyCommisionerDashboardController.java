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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author showk
 */
public class DeputyCommisionerDashboardController implements Initializable {

    @FXML    private Label userTypeOutputLabel;
    @FXML    private Label userIdOutputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void approvalRequestByDRROButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("ApprovalRequestByDRRO.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    
//FXML done, Scene Switch done
    @FXML
    private void logOutButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    //FXML done, Scene Switch done
    @FXML
    private void vehicleAllotmentButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("AllotmentOfVehiclesToDifferentOffices.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void budgetAndControlButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void transferRequestsButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void requestFromACLandButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void newRecruitmentButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void gatherApprovalButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void officialMeetsButtonOnClick(ActionEvent event) throws IOException {
        Parent forgotPassword = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        
        Scene scene = new Scene(forgotPassword);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    
}
