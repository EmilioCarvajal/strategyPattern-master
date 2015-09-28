package mx.iteso.strategy.behaviors.balls;

import mx.iteso.strategy.balls.SoccerBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SoccerBallTest {

    @Test
    public void testSoccerBallTets(){

        SoccerBall soccerBall = new SoccerBall();
        assertEquals("I'm bouncing normally!",soccerBall.performBounce());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
        assertEquals("I'm Large",soccerBall.performSize());
    }
}
