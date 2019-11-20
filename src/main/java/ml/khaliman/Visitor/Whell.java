package ml.khaliman.Visitor;
class Whell implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
