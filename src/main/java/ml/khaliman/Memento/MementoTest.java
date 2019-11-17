package ml.khaliman.Memento;
public class MementoTest { // Test
    public static void main(String[] args) {
        SaveUser saveUser = new SaveUser();
        User user1 = new User("Peter", 17);
        User user2 = new User("Ian", 19);
        saveUser.add(user1.save());
        user1.restore(saveUser.get(0));
    }
}
