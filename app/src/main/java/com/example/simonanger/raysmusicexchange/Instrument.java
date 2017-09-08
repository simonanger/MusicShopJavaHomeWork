package com.example.simonanger.raysmusicexchange;

/**
 * Created by simonanger on 08/09/2017.
 */

public abstract class Instrument implements Playable, Sellable {
    String type;
    String brand;
    String model;
    Double purchasePrice;
    Double sellingPrice;

    public Instrument(String type, String brand, String model,
                      Double purchasePrice, Double sellingPrice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String play() {
        return play();
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public Double getMarkup() {
        Double markup = sellingPrice - purchasePrice;
        return markup;
    }


}
