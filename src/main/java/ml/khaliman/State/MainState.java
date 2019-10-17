package Patterns.State;

public class MainState {
    public static void main(String[] args) {
        Context context = new Context();
        State created = new Created();
        State under_consideration = new Under_consideration();
        State rejected = new Rejected();
        context.setState(created);
        context.doAction();
        context.setState(under_consideration);
        context.doAction();
        context.setState(rejected);
        context.doAction();

    }
}
