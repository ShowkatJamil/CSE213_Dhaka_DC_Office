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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SubmitEvictionNoticeController implements Initializable {

    @FXML
    private AnchorPane submitEvictionNoticeAnchorPane;
    @FXML
    private TableView<?> submitEvictionNoticeTableView;
    @FXML
    private TableColumn<?, ?> userIdColumn;
    @FXML
    private TableColumn<?, ?> plotNoColumn;
    @FXML
    private TableColumn<?, ?> khatianNoColumn;
    @FXML
    private TableColumn<?, ?> preseentPossessorColumn;
    @FXML
    private TableColumn<?, ?> districtColumn;
    @FXML
    private TableColumn<?, ?> upazillaColumn;
    @FXML
    private TableColumn<?, ?> mouzaColumn;
    @FXML
    private TextField enterPlotNoTextField;
    @FXML
    private TextField enterKhatianNoTextField;
    @FXML
    private TextField enterPresentPossessorTextField;
    @FXML
    private TextField enterDistrictTextField;
    @FXML
    private TextField enterUpazillaTextField;
    @FXML
    private TextField enterMouzaTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitNoticeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landDashboardParent = FXMLLoader.load(getClass().getResource("ACLandDashboard.fxml"));
        Scene dashboard = new Scene(landDashboardParent);
        
        Stage landdashstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        landdashstg.show();
        landdashstg.setScene(dashboard);

        
    }
    
}
