package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Small;

public class TennisBall extends Ball {

    public TennisBall(){
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        type = "Golf ball";
        sizeBehavior = new Small();
    }
}
