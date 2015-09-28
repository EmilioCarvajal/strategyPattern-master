package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.Medium;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new Deflatable();
        type = "American Football ball";
        sizeBehavior = new Medium();
    }
}
