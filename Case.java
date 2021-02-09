package com.company;

public class Case {

    private String model;
    private String manufacturer;
    private String power;
    private Diamention diamention;


    public Case(String model, String manufacturer, String power, Diamention diamention) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.power = power;
        this.diamention = diamention;
    }


    public void power(){
        System.out.println("CPU power is on!");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPower() {
        return power;
    }

    public Diamention getDiamention() {
        return diamention;
    }

}
