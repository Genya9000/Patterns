package Patterns.Observer;

public class MainObserver {
    public static void main(String[] args) {
        Post post = new Post();
        Director director = new Director();
        post.addedition("Мурзилка");
        post.addObserver(director);
        post.addedition("Крокодил");
        post.removeedition("Мурзилка");
    }
}
