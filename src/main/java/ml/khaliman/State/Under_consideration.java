package Patterns.State;

public class Under_consideration implements State {
    @Override
    public void doAction() {
        System.out.println("Ваш заказ находится в состоянии На рассмотрении");
    }
}
