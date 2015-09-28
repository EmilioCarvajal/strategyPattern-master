package mx.iteso.strategy.behaviors.balls;

import mx.iteso.strategy.balls.SquashBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by armando on 19/09/15.
 */
public class SquashBallTest {


    @Test
    public void testSquashBallTets(){

        SquashBall squashBall = new SquashBall();
        assertEquals("I'm bouncing normally!",squashBall.performBounce());
        assertEquals("I can't deflate!", squashBall.performDeflate());
        assertEquals("I can't inflate!", squashBall.performInflate());
        assertEquals("Golf ball is rolling!", squashBall.roll());
        assertEquals("I'm Small",squashBall.performSize());
    }
}
