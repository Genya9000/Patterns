package Patterns.Strategy;

public class FlyWithMagia implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Летать с помощью магии умеют только водяные и русалки");
    }
}
