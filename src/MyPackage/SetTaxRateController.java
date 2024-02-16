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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SetTaxRateController implements Initializable {

    @FXML
    private AnchorPane setTaxRatesAnchorPane;
    @FXML
    private TextField lessTenRateTextField;
    @FXML
    private TextField lessFiftyRateTextField;
    @FXML
    private TextField lessHundredRateTextField;
    @FXML
    private TextField moreHundredRateTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void setRatesButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException {
        
        Parent taxDashboardParent = FXMLLoader.load(getClass().getResource("ACTaxDashboard.fxml"));
        Scene taxdashboard = new Scene(taxDashboardParent);
        
        Stage taxdashstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        taxdashstg.show();
        taxdashstg.setScene(taxdashboard);
    }

    @FXML
    private void viewLandTaxesButtonOnClick(ActionEvent event) throws IOException {
        
        Parent individLandParent = FXMLLoader.load(getClass().getResource("IndividualLandTaxes.fxml"));
        Scene individual = new Scene(individLandParent);
        
        Stage individlandstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        individlandstg.show();
        individlandstg.setScene(individual);
    }
    
}
