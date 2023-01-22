


package com.Takeda.Train;

import com.Takeda.Train.train.fTrain;
import com.Takeda.Train.train.pTrain;
import com.Takeda.Train.wagon.*;
import com.company.wagon.*;


public class Main {

    public static void main(String[] args) {
        int totWeightp = 0;
        int totWeightf = 0;

        fTrain freight = new fTrain();
        pTrain passenger = new pTrain();


        Wagon[] gruz = new Wagon[4];
        gruz[0] = new Locomotive(4000, 20);
        gruz[1] = new FreightWagon(67, 89, 78, "Coal");
        gruz[2] = new FreightWagon(20, 35, 60, "Iron");
        gruz[3] = new FreightWagon(22, 30, 5, "Gold");

        System.out.println("Info about driver of Freight Train: "+freight);
        System.out.println("Info about train:");

        System.out.println(gruz[0]);
        for (Wagon wagon : gruz) {
            System.out.println("Wagon: ");
            freight.giveInfo(wagon);
        }


        for (int i = 0;i<4;i++){
            totWeightf+= gruz[i].totalWeight();
        }

        System.out.println("Total weight of Feight Train: " +totWeightf+"kg");
        System.out.println("Maximum speed of Feight Train: "+Math.sqrt(gruz[0].getPower()*2/totWeightf)+"km/h");

        Wagon[] pass = new Wagon[6];
        pass[0] = new Locomotive(4000,20);
        pass[1] = new Economy(3000,30,25,4);
        pass[2] = new Economy(3000,30,24,4);
        pass[3] = new Lux(3000,40,8,4);
        pass[4] = new Lux(3000,50,10,5);
        pass[5] = new Lux(3000,30,6,3);
        System.out.println("Info about driver of Passenger Train: "+passenger);
        System.out.println("Info about train:");

        System.out.println(pass[0]);
        for (Wagon wagon : pass){
            System.out.println("Wagon: ");
            passenger.giveInfo(wagon);
        }

        for (int i = 0;i<6;i++){
            totWeightp += pass[i].totalWeight();
        }

        System.out.println("Total weight of Passenger Train: " +totWeightp+"T");
        System.out.println("Maximum speed of Passenger Train: "+Math.sqrt(pass[0].getPower()*2/totWeightp)+"km/h");
    }
}

