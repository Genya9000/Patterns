package Patterns.Composite;

public class Compozite {
    public static void main(String[] args) {
        Calc first = new FirstClass();
        Calc second = new SecondClass();
        Sum sum = new Sum();
        sum.add(first);
        sum.add(second);
        System.out.println(sum.compute());
    }
}
