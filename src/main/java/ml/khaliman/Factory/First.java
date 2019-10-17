package Patterns.Factory;

public class First implements Figure {
    @Override
    public void getFigure() {
        System.out.println("Я фигура с одним квадратом");
    }
}
