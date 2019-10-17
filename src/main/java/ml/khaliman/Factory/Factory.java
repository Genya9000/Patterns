package Patterns.Factory;

public class Factory {
    public Figure getCurrentFigure(String inputos) {
        Figure figure = null;
        if (inputos.equals("one")) {
            figure = new First();
        } else if (inputos.equals("two")) {
            figure = new Second();
        } else if (inputos.equals("three")) {
            figure = new Third();
        }
        return figure;
    }
}
