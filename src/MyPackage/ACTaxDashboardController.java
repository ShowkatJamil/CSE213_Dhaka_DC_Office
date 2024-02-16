//Everytime something is scheduled or approved or archived, delete previously pending row
//Collected land tax is entered by ac land, maybe from physical reports
//only ac land can see size and value of land, for tax collection and adding new land
//archiving means saving binary file

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
public class ACTaxDashboardController implements Initializable {

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
    private void viewProfileButtonOnClick(ActionEvent event) {
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
    private void setTaxRatesButtonOnClick(ActionEvent event) throws IOException {
        
        Parent setTaxParent = FXMLLoader.load(getClass().getResource("SetTaxRate.fxml"));
        Scene setTax = new Scene(setTaxParent);
        
        Stage settaxstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        settaxstg.show();
        settaxstg.setScene(setTax);
        
    }

    @FXML
    private void landTaxReportButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landTaxesParent = FXMLLoader.load(getClass().getResource("LandTaxReports.fxml"));
        Scene landTaxes = new Scene(landTaxesParent);
        
        Stage landtaxesstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        landtaxesstg.show();
        landtaxesstg.setScene(landTaxes);
    }

    @FXML
    private void sendTaxReportToNbrButtonOnClick(ActionEvent event) throws IOException {
        
        Parent sendToNbrParent = FXMLLoader.load(getClass().getResource("SendTaxReportToNBR.fxml"));
        Scene nbr = new Scene(sendToNbrParent);
        
        Stage nbrstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        nbrstg.show();
        nbrstg.setScene(nbr);
    }

    @FXML
    private void checkTaxFraudButtonOnClick(ActionEvent event) throws IOException {
        
        Parent checkFraudParent = FXMLLoader.load(getClass().getResource("CheckTaxFraud.fxml"));
        Scene fraud = new Scene(checkFraudParent);
        
        Stage fraudstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        fraudstg.show();
        fraudstg.setScene(fraud);
    }

    @FXML
    private void submitNoticeForDueTaxButtonOnClick(ActionEvent event) throws IOException {
        
        Parent dueTaxNoticeParent = FXMLLoader.load(getClass().getResource("SubmitDueTaxNotice.fxml"));
        Scene dueTaxNotice = new Scene(dueTaxNoticeParent);
        
        Stage duetaxnoticestg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        duetaxnoticestg.show();
        duetaxnoticestg.setScene(dueTaxNotice);
    }

    @FXML
    private void requestForFineButtonOnClick(ActionEvent event) throws IOException {
        
        Parent fineRequestParent = FXMLLoader.load(getClass().getResource("RequestForFine.fxml"));
        Scene fineRequest = new Scene(fineRequestParent);
        
        Stage finerequeststg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        finerequeststg.show();
        finerequeststg.setScene(fineRequest);
    }

    @FXML
    private void applyForTransferButtonOnClick(ActionEvent event) throws IOException {
        
        Parent transferParent = FXMLLoader.load(getClass().getResource("ApplyForTransfer.fxml"));
        Scene transfer = new Scene(transferParent);
        
        Stage transferstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        transferstg.show();
        transferstg.setScene(transfer);
    }

    @FXML
    private void updateTaxReportButtonOnClick(ActionEvent event) throws IOException {
        
        Parent updateTaxParent = FXMLLoader.load(getClass().getResource("UpdateTaxReport.fxml"));
        Scene updateTax = new Scene(updateTaxParent);
        
        Stage updatetaxstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        updatetaxstg.show();
        updatetaxstg.setScene(updateTax);
    }
    
}
