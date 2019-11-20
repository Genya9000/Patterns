package ml.khaliman.Visitor;
interface Visitor {
    void visit(SportCar sportCar);
    void visit(Engine engine);
    void visit(Whell whell);
}
