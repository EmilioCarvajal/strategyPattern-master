package mx.iteso.strategy.balls;


import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.Medium;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BowlingBall extends Ball {
    public BowlingBall(){
        bounceBehavior = new Crash();
        deflateBehavior = new NotDeflatable();
        type = "Bowling ball";
        sizeBehavior = new Medium();

    }
}
