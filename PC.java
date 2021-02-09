package com.company;

public class PC {
    private Motherbord motherbord;
    private Monitor monitor;
    private Case theCase;

    public PC(Motherbord motherbord,Monitor monitor,Case theCase){
        this.motherbord=motherbord;
        this.monitor=monitor;
        this.theCase=theCase;
    }
    public void compile(){
        System.out.println("compiled successfully!");
    }
    public Motherbord getMotherbord(){
        return motherbord;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor(){
        return monitor;
    }

}