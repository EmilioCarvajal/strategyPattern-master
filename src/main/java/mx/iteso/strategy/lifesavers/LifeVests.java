package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotation;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by armando on 20/09/15.
 */
public class LifeVests  extends Lifesaver {
    public LifeVests() {
        type = "Life Vests";

        deflateBehavior = new NotDeflatable();
        flotationBehavior = new Flotation();


    }
}