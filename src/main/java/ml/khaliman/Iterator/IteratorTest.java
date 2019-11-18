package ml.khaliman.Iterator;
public class IteratorTest {//тест
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Iterator iterator = numbers.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
