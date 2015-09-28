package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.*;

//DeflateBehavior

public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();
            Lifesaver foamFloats = new FoamFloats();
            Lifesaver lifesaversCandies = new LifesaversCandies();
            Lifesaver lifeVests = new LifeVests();
            Lifesaver swimBelts = new SwimBelts();
            Lifesaver waterTubes = new WaterTubes();



            System.out.println(swimRing.display());
            System.out.println(swimRing.inflating());
            System.out.println(swimRing.deflating());
            System.out.println(swimRing.floating());


            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.inflating());
            System.out.println(swimSeat.deflating());
            System.out.println(swimSeat.floating());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.inflating());
            System.out.println(armBands.deflating());
            System.out.println(armBands.floating());

            System.out.println();

            System.out.println(foamFloats.display());
            System.out.println(foamFloats.inflating());
            System.out.println(foamFloats.deflating());
            System.out.println(foamFloats.floating());

            System.out.println();

            System.out.println(lifesaversCandies.display());
            System.out.println(lifesaversCandies.inflating());
            System.out.println(lifesaversCandies.deflating());
            System.out.println(lifesaversCandies.floating());

            System.out.println();

            System.out.println(lifeVests.display());
            System.out.println(lifeVests.inflating());
            System.out.println(lifeVests.deflating());
            System.out.println(lifeVests.floating());

            System.out.println();

            System.out.println(swimBelts.display());
            System.out.println(swimBelts.inflating());
            System.out.println(swimBelts.deflating());
            System.out.println(swimBelts.floating());

            System.out.println();

            System.out.println(waterTubes.display());
            System.out.println(waterTubes.inflating());
            System.out.println(waterTubes.deflating());
            System.out.println(waterTubes.floating());
        }
}
