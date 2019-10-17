package Patterns.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Strategy strategy = new CanFly_Walk();

        Context context = new Context(strategy);
        context.contextInterface();
    }
}
