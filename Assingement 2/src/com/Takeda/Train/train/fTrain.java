package com.Takeda.Train.train;

import com.Takeda.Train.driver.Professionals;
import com.Takeda.Train.wagon.Wagon;

public class fTrain {
    Professionals driver = new Professionals("Sultan", "Kuanish","4");

    public void giveInfo(Wagon wagon){
        System.out.print("Weight: "+wagon.weight+"T || ");
        System.out.print("Volume: "+wagon.volume+"m^2 || ");
        System.out.print("Product: "+wagon.getProduct()+" || ");
        System.out.println("Total weight of wagon: "+wagon.totalWeight()+"T");
    }





    public String toString(){
        return  "\n"+driver.First_name+"\n"
                +"\n"+driver.Second_name+"\n"
                +"Exprerience: "+driver.exp+" years";
    }
}

