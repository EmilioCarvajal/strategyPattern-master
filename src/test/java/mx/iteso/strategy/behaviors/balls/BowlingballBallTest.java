package mx.iteso.strategy.behaviors.balls;

import mx.iteso.strategy.balls.BowlingBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by armando on 19/09/15.
 */
public class BowlingballBallTest {

    @Test
    public void testBowlingballBallTets(){

        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("I crashed!! I can't bounce",bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("Bowling ball is rolling!", bowlingBall.roll());
        assertEquals("I'm Medium",bowlingBall.performSize());
    }
}
