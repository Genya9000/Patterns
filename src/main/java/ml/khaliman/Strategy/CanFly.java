package Patterns.Strategy;

public class CanFly implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Эльфы и пегасы умеют только летать");
    }
}
