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
 * @author User
 */
public class ACLandDashboardController implements Initializable {

    @FXML
    private Label welcomeLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changePasswordButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) throws IOException {
        
        Parent logOutParent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        Scene logOut = new Scene(logOutParent);
        
        Stage stglogout = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stglogout.show();
        stglogout.setScene(logOut);
    }

    @FXML
    private void viewProfileButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void grantLandHearingButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landHearingParent = FXMLLoader.load(getClass().getResource("GrantHearingDate.fxml"));
        Scene hearing = new Scene(landHearingParent);
        
        Stage stglandhearing = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stglandhearing.show();
        stglandhearing.setScene(hearing);        
    }

    @FXML
    private void requestSurveyButtonOnClick(ActionEvent event) throws IOException {
        
        Parent requestSurveyParent = FXMLLoader.load(getClass().getResource("RequestDlrsForSurvey.fxml"));
        Scene survey = new Scene(requestSurveyParent);
        
        Stage stgsurvey = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stgsurvey.show();
        stgsurvey.setScene(survey);                
    }

    @FXML
    private void landMutationApplicationButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landMutationParent = FXMLLoader.load(getClass().getResource("LandMutationApplications.fxml"));
        Scene mutation = new Scene(landMutationParent);
        
        Stage stgmutation = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stgmutation.show();
        stgmutation.setScene(mutation);                

        
    }

    @FXML
    private void archiveKhatiansButtonOnClick(ActionEvent event) throws IOException {
        
        Parent archiveKhatiansParent = FXMLLoader.load(getClass().getResource("ArchiveKhatians.fxml"));
        Scene archive = new Scene(archiveKhatiansParent);
        
        Stage archiveStg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        archiveStg.show();
        archiveStg.setScene(archive);
    }

    @FXML
    private void landRecordsButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landRecordsParent = FXMLLoader.load(getClass().getResource("LandRecords.fxml"));
        Scene records = new Scene(landRecordsParent);
        
        Stage recordStg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        recordStg.show();
        recordStg.setScene(records);
    }

    @FXML
    private void submitEvictionNoticeButtonOnClick(ActionEvent event) throws IOException {
        
        Parent evictionParent = FXMLLoader.load(getClass().getResource("SubmitEvictionNotice.fxml"));
        Scene eviction = new Scene(evictionParent);
        
        Stage evictionstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        evictionstg.show();
        evictionstg.setScene(eviction);
    }

    @FXML
    private void requestHearingButtonOnClick(ActionEvent event) throws IOException {
        
        Parent requestHearingParent = FXMLLoader.load(getClass().getResource("RequestHearing.fxml"));
        Scene requestHearing = new Scene(requestHearingParent);
        
        Stage requestlandhearingstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        requestlandhearingstg.show();
        requestlandhearingstg.setScene(requestHearing);
        
    }

    @FXML
    private void submitTaxReportButtonOnClick(ActionEvent event) throws IOException {
        
        Parent submitTaxParent = FXMLLoader.load(getClass().getResource("SubmitTaxReport.fxml"));
        Scene submitTax = new Scene(submitTaxParent);
        
        Stage submittaxstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        submittaxstg.show();
        submittaxstg.setScene(submitTax);
    }
    
}
