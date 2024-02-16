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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SubmitDueTaxNoticeController implements Initializable {

    @FXML
    private AnchorPane submitDueTaxNoticeAnchorPane;
    @FXML
    private TextField khatianTextField;
    @FXML
    private TextField dueTaxTextField;
    @FXML
    private TextField possessorTextField;
    @FXML
    private TextArea allNoticeTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewAllNoticesButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException {
        
        Parent taxDashboardParent = FXMLLoader.load(getClass().getResource("ACTaxDashboard.fxml"));
        Scene taxdashboard = new Scene(taxDashboardParent);
        
        Stage taxdashstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        taxdashstg.show();
        taxdashstg.setScene(taxdashboard);
    }
    
}
