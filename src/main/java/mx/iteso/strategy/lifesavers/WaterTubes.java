package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotation;

/**
 * Created by armando on 20/09/15.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes() {
        type = "Water Tubes";

        deflateBehavior = new Deflatable();
        flotationBehavior = new Flotation();


    }
}
