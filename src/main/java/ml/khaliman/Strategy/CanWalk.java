package Patterns.Strategy;

public class CanWalk implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Орки и гарпии умеют только ходить");
    }
}
