package Patterns.Chain;

public class Fiksation implements BaseInterfase {
    private String message ;
    public Fiksation(String message) {
        this.message = message;
    }
    @Override
    public String handleRequest() {
        System.out.println("message in Ficsation: " + message);
        return message;
    }
}
