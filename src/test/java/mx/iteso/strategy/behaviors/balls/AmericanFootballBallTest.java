package mx.iteso.strategy.behaviors.balls;

import mx.iteso.strategy.balls.AmericanFootballBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmericanFootballBallTest {
    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        assertEquals("I'm bouncing irregularly!", americanFootballBall.performBounce());
        assertEquals("I'm deflating!", americanFootballBall.performDeflate());
        assertEquals("I'm inflating!", americanFootballBall.performInflate());
        assertEquals("American Football ball is rolling!", americanFootballBall.roll());
        assertEquals("I'm Medium",americanFootballBall.performSize());
    }
}
