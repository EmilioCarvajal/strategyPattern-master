package mx.iteso.strategy.behaviors.impl;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallTest {

    @Test
    public void testSmallSize(){
        Small small = new Small();
        assertEquals("I'm Small", small.Size());

    }

}
