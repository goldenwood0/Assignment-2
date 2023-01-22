package com.Takeda.Train.train;

import com.Takeda.Train.driver.Professionals;
import com.Takeda.Train.wagon.Wagon;

public class pTrain {
    Professionals driver = new Professionals("Ramazan","Smagulov","6");

    public void giveInfo(Wagon wagon){
        System.out.print("Weight: "+wagon.weight+"kg || ");
        System.out.println("Amount of people: "+wagon.getPeople());
        System.out.println("Amount of rooms: "+wagon.getRooms());
        System.out.println("Price for 1 ticket: "+wagon.getCost()+"$");
    }



    public String toString(){
        return  "\n"+driver.First_name+"\n"
                +"\n"+driver.Second_name+"\n"
                +"Exprerience: "+driver.exp+" years";
    }
}
