package com.example.simonanger.raysmusicexchange;

/**
 * Created by simonanger on 08/09/2017.
 */

public class Drums extends Instrument {
    private int numberofToms;

    public Drums(String type, String brand, String model, int numberofToms,
                 Double purchasePrice, Double sellingPrice) {
        super(type, brand, model, purchasePrice, sellingPrice);
        this.numberofToms = numberofToms;
    }

    public String play(){
        return "Ba dum tiss";
    }

    public int getNumberofToms(){
        return numberofToms;
    }
}
