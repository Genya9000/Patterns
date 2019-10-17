package Patterns.Prototype;

public class Article implements Copyable {
    public Type type;
    @Override
    public Article copy() {
        Article article = new Article();
        return article;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
