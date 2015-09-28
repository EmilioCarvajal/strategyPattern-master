package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IrregularBounceTest {

   @Test
   public void testIrregularBounce() {
       IrregularBounce Irregular = new IrregularBounce();
       assertEquals("I'm bouncing irregularly!",Irregular.bounce());

   }


}
