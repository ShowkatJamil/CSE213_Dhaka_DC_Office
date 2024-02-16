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
 * @author tasni
 */
public class CitizenDashboardController implements Initializable {

    @FXML
    private Label userTypeOutputLabel;
    @FXML
    private Label citizenNameOutputLabel;
    @FXML
    private Label citizenUserIdOutputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void certifiedCopiesofPorchaOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("CheckPorchaCopies.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void applyForFoodGrainLicenseOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("FoodGrainLicense.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void applyForFirearmLicenseOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("FireArmsLicense.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void complainAgainstIllegalActivitiesOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("FillingComplainIllegalActivities.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void applyForTradeLicenseOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("TradeLicense.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void applyForVendorLicenseOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("StampVendorLicense.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void viewAllExistingLawsOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ViewExistingLawsCitizen.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void complaintAgainstIllegalLandOccupationOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("FillingComplaintIllegalLandOccupation.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void logOutOnClick(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setTitle("Main Stage");
        stg.setScene(scene);
        stg.show();
    }
    
}
