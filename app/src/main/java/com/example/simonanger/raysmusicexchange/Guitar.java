package com.example.simonanger.raysmusicexchange;


/**
 * Created by simonanger on 08/09/2017.
 */

public class Guitar extends Instrument {
    private int numberOfStrings;


    public Guitar(String type, String brand, String model, int numberOfStrings,
                  Double purchasePrice, Double sellingPrice) {
        super(type, brand, model, purchasePrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "Riff";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


}
