package Patterns.Strategy;

public class CanFly_Walk implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Летать и ходить умеют только тролли и вампиры");
    }
}
