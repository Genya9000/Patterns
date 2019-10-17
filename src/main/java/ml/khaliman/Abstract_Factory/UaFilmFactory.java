package Patterns.Abstract_Factory;

public class UaFilmFactory implements AbsFactory {
    @Override
    public Term1 getTerm1() {
        return new UaTerm1imp();

    }

    @Override
    public Term2 getTerm2() {
        return new UaTerm2imp();
    }

    @Override
    public Term3 getTerm3() {
        return new UaTerm3imp();
    }
}
