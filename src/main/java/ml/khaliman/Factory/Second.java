package Patterns.Factory;

public class Second implements Figure {
    @Override
    public void getFigure() {
        System.out.println("Я фигура с двумя квадратами");
    }
}
