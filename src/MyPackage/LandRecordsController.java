/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LandRecordsController implements Initializable {

    @FXML private BorderPane landRecordsBorderPane;
    @FXML private TableView<Land> landTableView;
    @FXML private TableColumn<Land, Integer> plotNoColumn;
    @FXML private TableColumn<Land, Integer> khatianNoColumn;
    @FXML private TableColumn<Land, Integer> possessorIdColumn;
    @FXML private TableColumn<Land, String> districtColumn;
    @FXML private TableColumn<Land, String> upazillaColumn;
    @FXML private TableColumn<Land, String> mouzaColumn;
    @FXML private TableColumn<Land, Integer> sizeColumn;
    @FXML private TableColumn<Land, Integer> valueColumn;
          
    @FXML private TextField plotTextField;
    @FXML private TextField khatianTextField;
    @FXML private TextField presentPossessorTextField;
    @FXML private TextField districtTextField;
    @FXML private TextField upazillaTextField;
    @FXML private TextField mouzaTextField;
    @FXML private TextField valueTextField;
    @FXML private TextField sizeTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException {
        
        Parent landDashboardParent = FXMLLoader.load(getClass().getResource("ACLandDashboard.fxml"));
        Scene dashboard = new Scene(landDashboardParent);
        
        Stage landdashstg = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        landdashstg.show();
        landdashstg.setScene(dashboard);
    }

    @FXML
    private void deleteRecordsButttonOnClick(ActionEvent event) {
    }



    @FXML
    private void addRecordButtonOnClick(ActionEvent event) {
        
        
    }

    @FXML
    private void changeValueCellEvent(CellEditEvent edittedCell) {
        
        //Land landchoice = landTableView.getSelectionModel().getSelectedItem();
        //landchoice.setValue(Integer.parseInt(edittedCell.getNewValue().toString()));

    }

}
