package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Motherbord myMotherbord=new Motherbord("Gigabyte","Gibson",4);
        Resolution resolution=new Resolution(1500,400);
        Monitor myMonitor=new Monitor("FAX-480","Dell",resolution);
        Case myCase=new Case("BG-420","MSI","240DC",new Diamention(200,400));
        PC myPc=new PC(myMotherbord,myMonitor,myCase);
        System.out.println(myPc.getMotherbord().getManufacturer());
        myPc.getMotherbord().loadProgramme("Bootstrap");
        myPc.getMonitor().loadPixels(4,5,"Red");

    }

}
