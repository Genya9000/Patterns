package Patterns.Abstract_Factory;

public class RuFilmFactory implements AbsFactory {
    @Override
    public Term1 getTerm1() {
        return new RuTerm1imp();
    }

    @Override
    public Term2 getTerm2() {
        return new RuTerm2imp();
    }

    @Override
    public Term3 getTerm3() {
        return new RuTerm3imp();
    }
}
