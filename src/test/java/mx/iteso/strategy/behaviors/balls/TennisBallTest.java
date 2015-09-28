package mx.iteso.strategy.behaviors.balls;


import mx.iteso.strategy.balls.TennisBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisBallTest {

    @Test
    public void testTennisBallTets(){

        TennisBall tennisBall = new TennisBall();
        assertEquals("I'm bouncing normally!",tennisBall.performBounce());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("Golf ball is rolling!", tennisBall.roll());
        assertEquals("I'm Small",tennisBall.performSize());
    }

}
