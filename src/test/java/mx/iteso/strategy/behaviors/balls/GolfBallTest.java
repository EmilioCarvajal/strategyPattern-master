package mx.iteso.strategy.behaviors.balls;

import mx.iteso.strategy.balls.GolfBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GolfBallTest {

    @Test
    public void testGolfBallTets(){

        GolfBall golfBall = new GolfBall();
        assertEquals("I'm bouncing normally!",golfBall.performBounce());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("Golf ball is rolling!", golfBall.roll());
        assertEquals("I'm Small",golfBall.performSize());
    }
}
