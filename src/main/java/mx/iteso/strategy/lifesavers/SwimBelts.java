package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Flotation;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by armando on 20/09/15.
 */
public class SwimBelts  extends Lifesaver {
    public SwimBelts() {
        type = "Swim Seat";

        deflateBehavior = new NotDeflatable();
        flotationBehavior = new Flotation();


    }
}
