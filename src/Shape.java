/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Niegel
 */
import java.util.ArrayList; // import the ArrayList class

public abstract class Shape {
    protected double unitPrice;
    protected ArrayList<Double> dimensionList = new ArrayList<Double>();
    
    public abstract double calculateArea();

    public ArrayList<Double> getDimensionList() {
        return dimensionList;
    }

    public void setDimensionList(ArrayList<Double> dimensionList) {
        this.dimensionList = dimensionList;
    }
    
    
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
}