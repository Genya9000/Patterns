package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        String language = "UA";
        String subtitre = "UA";
        AbsFactory absFactory = null;
        if(language.equals("UA") && subtitre.equals("UA")) {
            absFactory = new UaFilmFactory();
        } else if(language.equals("RU") && subtitre.equals("RU")) {
            absFactory = new RuFilmFactory();
        }
        Term1 term1 = absFactory.getTerm1();
        System.out.println(term1.getTerm1watch());
    }
}
