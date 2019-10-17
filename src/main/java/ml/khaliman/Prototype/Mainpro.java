package Patterns.Prototype;

public class Mainpro {
    public static void main(String[] args) {


        Article prototipe = new Article();
        Article clone = prototipe.copy();
        clone.setType(Type.ONE);
        System.out.println(clone.type);
    }
}