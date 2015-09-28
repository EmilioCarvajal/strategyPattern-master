package mx.iteso.strategy.behaviors.impl;


import mx.iteso.strategy.behaviors.FlotationBehavior;

public class NotFlotation implements FlotationBehavior {

    public String flotation() {
        return "I can't float!";
    }

}
