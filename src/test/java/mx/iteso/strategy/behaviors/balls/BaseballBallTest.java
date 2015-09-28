package mx.iteso.strategy.behaviors.balls;


import mx.iteso.strategy.balls.BaseballBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseballBallTest {

    @Test
    public void testBaseballBallTets(){

        BaseballBall baseballBall = new BaseballBall();
        assertEquals("I'm bouncing irregularly!",baseballBall.performBounce());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
        assertEquals("I'm Small",baseballBall.performSize());
    }
}
