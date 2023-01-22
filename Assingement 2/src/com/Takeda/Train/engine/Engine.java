package com.Takeda.Train.engine;

import java.util.Scanner;

public class Engine {
    Scanner scan = new Scanner(System.in);
    public double power;
    public String manufacturer;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
    public Engine() {
        System.out.println("Choose Locomotive's manufacturer: ");
        System.out.println("Africa"+"\n"+"Japan"+"\n"+"Kazakhstan");
        while(true){
            this.manufacturer = scan.nextLine();
            if (manufacturer.equals("Africa")){
                power = 34677000;
                break;
            }
            else if (manufacturer.equals("Kazakhstan")){
                power = 17899999;
                break;
            }
            else if (manufacturer.equals("Japan")){
                power = 77777777;
                break;
            }
            else{
                System.out.println("We don't have another locomotives");
            }
        }
    }



    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
