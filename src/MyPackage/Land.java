/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author User
 */
public class Land {
    
    protected int plot, khatian, possessor, size, value;
    protected SimpleStringProperty district, upazilla, mouza;
    //protected SimpleIntegerProperty value;

    public Land(int plot, int khatian, int possessor, String district, String upazilla, String mouza, int size, int value) {
        this.plot = plot;
        this.khatian = khatian;
        this.possessor = possessor;
        this.district = new SimpleStringProperty(district);
        this.upazilla = new SimpleStringProperty(upazilla);
        this.mouza = new SimpleStringProperty(mouza);
        this.size = size;
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SimpleStringProperty getDistrict() {
        return district;
    }

    public void setDistrict(SimpleStringProperty district) {
        this.district = district;
    }

    public SimpleStringProperty getUpazilla() {
        return upazilla;
    }

    public void setUpazilla(SimpleStringProperty upazilla) {
        this.upazilla = upazilla;
    }

    public SimpleStringProperty getMouza() {
        return mouza;
    }

    public void setMouza(SimpleStringProperty mouza) {
        this.mouza = mouza;
    }

    public int getPlot() {
        return plot;
    }

    public void setPlot(int plot) {
        this.plot = plot;
    }

    public int getKhatian() {
        return khatian;
    }

    public void setKhatian(int khatian) {
        this.khatian = khatian;
    }

    public int getPossessor() {
        return possessor;
    }

    public void setPossessor(int possessor) {
        this.possessor = possessor;
    }
    
    
    
    public Land() {
        
    }

    
}

