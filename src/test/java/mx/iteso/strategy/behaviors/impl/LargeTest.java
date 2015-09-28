package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeTest {

    @Test
    public void testLargeSize(){
        large large = new large();
        assertEquals("I'm Large", large.Size());

    }

}
