package Patterns.State;

public class Created implements State {
    @Override
    public void doAction() {
        System.out.println("Ваш заказ находится в состоянии Создан");
    }
}
