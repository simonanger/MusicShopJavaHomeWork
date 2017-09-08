package com.example.simonanger.raysmusicexchange;

/**
 * Created by simonanger on 08/09/2017.
 */

public class Accessory implements Sellable {
    String name;
    Double purchasePrice;
    Double sellingPrice;

    public Accessory (String name, Double purchasePrice, Double sellingPrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Double getSellingPrice() {
        return  sellingPrice;
    }

    public Double getMarkup() {
        Double markup = sellingPrice - purchasePrice;
        return markup;
    }
}
