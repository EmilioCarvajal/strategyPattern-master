package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by armando on 19/09/15.
 */
public class NormalBounceTest {

    @Test
    public void testNormalBounce() {
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!",normalBounce.bounce());

    }
}
