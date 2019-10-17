package Patterns.Factory;


import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MainFactory {
    public static void main(String[] args) {


        ArrayList<String> figureHashSet = new ArrayList<>();

        figureHashSet.add("one");
        figureHashSet.add("two");
        figureHashSet.add("three");
        Collections.shuffle(figureHashSet);
        String[] num = new String[figureHashSet.size()];
        for (int i = 0; i < figureHashSet.size(); i++) {
            num[i] = figureHashSet.get(i);
        }

        String fig = num[0];
        Factory factory = new Factory();
        Figure figure = factory.getCurrentFigure(fig);
        figure.getFigure();
    }
}