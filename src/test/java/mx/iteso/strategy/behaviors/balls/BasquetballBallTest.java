package mx.iteso.strategy.behaviors.balls;

import mx.iteso.strategy.balls.BasquetballBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by armando on 19/09/15.
 */
public class BasquetballBallTest {

    @Test
    public void testBasquetballBallTets(){

        BasquetballBall basquetballBall = new BasquetballBall();
        assertEquals("I'm bouncing normally!",basquetballBall.performBounce());
        assertEquals("I'm deflating!", basquetballBall.performDeflate());
        assertEquals("I'm inflating!", basquetballBall.performInflate());
        assertEquals("Basquetball ball is rolling!", basquetballBall.roll());
        assertEquals("I'm Large",basquetballBall.performSize());
    }
}
