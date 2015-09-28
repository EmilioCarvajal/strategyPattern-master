package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFlotation;

public class LifesaversCandies extends Lifesaver {
    public LifesaversCandies() {
        type = "Lifesavers Candies";

        deflateBehavior = new NotDeflatable();
        flotationBehavior = new NotFlotation();

    }
}

