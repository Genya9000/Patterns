package ml.khaliman.Visitor;
public class VisitorTest {
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarVisitor());
    }
}
