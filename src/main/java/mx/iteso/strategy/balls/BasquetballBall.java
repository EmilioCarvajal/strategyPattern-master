package mx.iteso.strategy.balls;


import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.large;

public class BasquetballBall extends Ball {

    public BasquetballBall(){
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "Basquetball ball";
        sizeBehavior = new large();

    }
}




