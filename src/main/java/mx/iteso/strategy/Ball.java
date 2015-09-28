package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.SizeBehavior;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public String type;
    public SizeBehavior sizeBehavior;

    public Ball() {
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }


    public String performSize() {
        return sizeBehavior.Size();
    }

    public BounceBehavior getBounceBehavior(){
        return bounceBehavior;
    }

    public void setBounceBehavior(BounceBehavior bounceBehavior){
        this.bounceBehavior = bounceBehavior;
    }
}
