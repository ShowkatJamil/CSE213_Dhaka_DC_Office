/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author User
 */
public class TaxRate extends Land {
    protected int rate, landTax, collectedTax, dueAmount;

    public TaxRate(int khatian, int possessor, String district, String upazilla, String mouza, int size, int value) {
        
        this.rate = rate;
    }

    public TaxRate() {
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getLandTax() {
        return landTax;
    }

    public void setLandTax(int landTax) {
        this.landTax = landTax;
    }

    public int getCollectedTax() {
        return collectedTax;
    }

    public void setCollectedTax(int collectedTax) {
        this.collectedTax = collectedTax;
    }

    public int getDueAmount() {
        return dueAmount;
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
}
