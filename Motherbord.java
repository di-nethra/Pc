package com.company;

public class Motherbord {

    private String model;
    private String manufacturer;
    private int ramSlots;

    public void loadProgramme(String programme){
        System.out.println(programme+" loaded successfully!");
    }
    public Motherbord(String model,String manufacturer,int ramSlots){
        this.model=model;
        this.manufacturer=manufacturer;
        this.ramSlots=ramSlots;
    }

    public String model(){
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }





}
