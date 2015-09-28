package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;

public class Lifesaver {
    public String type;
    public DeflateBehavior deflateBehavior;
    public FlotationBehavior flotationBehavior;



    public String deflating() {
        return deflateBehavior.deflate();
    }

    public String inflating() {
        return deflateBehavior.inflate();
    }


    public String floating() {
        return flotationBehavior.flotation();
    }
    public String display() {
        return "I'm a " + type;
    }
}
