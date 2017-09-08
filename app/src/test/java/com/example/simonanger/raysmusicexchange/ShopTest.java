package com.example.simonanger.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by simonanger on 08/09/2017.
 */
public class ShopTest {
    ArrayList<Sellable> stock;
    Guitar guitar;
    Drums drums;

    @Before
    public void before() {
        stock = new ArrayList<>();
        stock.add(new Guitar("Stringed", "Ibanez", "RG", 7, 150.0, 200.0));
        stock.add(new Drums("Percussion", "Mapex", "Iron Works", 2, 100.0, 300.0));
    }

    @Test
    public void getStock() {
        stock.add(guitar, drums);

    }

}