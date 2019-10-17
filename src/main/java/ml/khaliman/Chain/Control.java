package Patterns.Chain;

public class Control implements BaseInterfase {
    private String message ;
    private Fiksation root ;
    public Control(Fiksation root, String message) {

        this.root = root;
        this.message = message;
    }
    @Override
    public String handleRequest() {
        System.out.println("message in Control: " + message);
        if (root == null) {
            return message;
        } else {
            return root.handleRequest();
        }
    }
}


