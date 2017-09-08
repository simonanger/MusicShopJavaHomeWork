package com.example.simonanger.raysmusicexchange;

/**
 * Created by simonanger on 08/09/2017.
 */

public class Keyboard extends Instrument {
    private int numberOfKeys;

    public Keyboard(String type, String brand, String model, int numberOfKeys,
                    Double purchasePrice, Double purchaseSellingPrice) {
        super (type, brand, model, purchasePrice, purchaseSellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public String play(){
        return "Arpeggio";
    }

    public int getNumberOfKeys(){
        return numberOfKeys;
    }
}
