package Patterns.Chain;

public class Comission implements BaseInterfase {
    private String message ;
    private Control parent ;
    public Comission(Control parent, String message) {
        this.parent = parent;
        this.message = message;
    }
    @Override
    public String handleRequest() {
        System.out.println("message in Comission: " + message);
        if (parent == null) {
            return message;
        } else {
            return parent.handleRequest();
        }
    }
}
