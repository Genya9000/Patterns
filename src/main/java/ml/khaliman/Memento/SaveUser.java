package ml.khaliman.Memento;
import java.util.ArrayList;
import java.util.List;

class SaveUser {
    private List<Memento> list = new ArrayList<Memento>();
    public void add(Memento memento){
        list.add(memento);
    }
    public Memento get(int ind){
        return list.get(ind);
    }
}
