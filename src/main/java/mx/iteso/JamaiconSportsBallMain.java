package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basquet = new BasquetballBall();
        Ball bowling = new BowlingBall();
        Ball golf = new GolfBall();
        Ball squash = new SquashBall();
        Ball tennis = new TennisBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performSize());


        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performSize());


        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performSize());

        System.out.println();

        System.out.println(basquet.roll());
        System.out.println(basquet.performBounce());
        System.out.println(basquet.performDeflate());
        System.out.println(basquet.performInflate());
        System.out.println(basquet.performSize());

        System.out.println();

        System.out.println(bowling.roll());
        System.out.println(bowling.performBounce());
        System.out.println(bowling.performDeflate());
        System.out.println(bowling.performInflate());
        System.out.println(bowling.performSize());

        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.performSize());

        System.out.println();

        System.out.println(squash.roll());
        System.out.println(squash.performBounce());
        System.out.println(squash.performDeflate());
        System.out.println(squash.performInflate());
        System.out.println(squash.performSize());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.performSize());




    }
}
