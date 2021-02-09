package com.company;

public class Resolution {
    private int width;
    private int length;

    public void loadResolution(){
        System.out.println("length:"+length+" width:"+width);
    }
    public Resolution(int width,int length){
     this.width=width;
     this.length=length;
    }
}
