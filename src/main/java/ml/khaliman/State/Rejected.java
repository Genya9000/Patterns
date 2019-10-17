package Patterns.State;

public class Rejected implements State {
    @Override
    public void doAction() {
        System.out.println("Ваш заказ находится в состоянии Отклонен");
    }
}
