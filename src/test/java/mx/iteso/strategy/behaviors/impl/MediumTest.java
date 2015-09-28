package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MediumTest {

    @Test
    public void testMediumSize(){
        Medium medium = new Medium();
        assertEquals("I'm Medium", medium.Size());

    }
}
