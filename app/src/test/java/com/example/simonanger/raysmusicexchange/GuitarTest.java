package com.example.simonanger.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by simonanger on 08/09/2017.
 */
public class GuitarTest {
    Guitar guitar;


    @Before
    public void before() {
        guitar = new Guitar("Stringed", "Ibanez", "RG", 7, 150.0, 200.0);

    }

    @Test
    public void testType(){
        assertEquals("Stringed", guitar.getType());
    }

    @Test
    public void testBrand(){
        assertEquals("Ibanez", guitar.getBrand());
    }

    @Test
    public void testModel(){
        assertEquals("RG", guitar.getModel());
    }

    @Test
    public void testNumberOfStrings(){
        assertEquals(7, guitar.getNumberOfStrings());
    }

    @Test
    public void testPlay(){
        assertEquals("Riff", guitar.play());
    }

    @Test
    public void testPurchasePrice() {
        assertEquals(150.0, guitar.getPurchasePrice(), 1e-6);
    }

    @Test
    public void testSellingPrice() {
        assertEquals(200.0, guitar.getSellingPrice(), 1e-6);
    }

    @Test
    public void testMarkup() {
        assertEquals(50.0, guitar.getMarkup(), 1e-6);
    }

}

