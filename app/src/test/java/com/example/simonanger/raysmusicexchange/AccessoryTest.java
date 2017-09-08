package com.example.simonanger.raysmusicexchange;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by simonanger on 08/09/2017.
 */
public class AccessoryTest {

    @Test
    public void getName() {
        Accessory guitarPicks = new Accessory("Picks", 0.5, 1.0);
        assertEquals("Picks", guitarPicks.getName() );
    }

    @Test
    public void getPurchasePrice() {
        Accessory strings = new Accessory("Guitar Strings", 2.0, 7.5);
        assertEquals(5.5, strings.getMarkup(), 1e-6);
    }

}