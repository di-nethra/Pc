package com.company;

public class Monitor {
    public String model;
    public String manufacturer;
    public Resolution moniRes;

    public void loadPixels(int x,int y,String color){
        System.out.println("pixels of length:"+x+" width:"+y+" of colour "+color+" loaded!" );
    }
    public Monitor(String model,String manufacturer,Resolution moniRes){
        this.model=model;
        this.manufacturer=manufacturer;
        this.moniRes=moniRes;
    }
}
