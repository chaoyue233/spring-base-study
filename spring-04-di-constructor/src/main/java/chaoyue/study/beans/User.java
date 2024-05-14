package chaoyue.study.beans;

public class User {
    private String name;
    private Cat cat;
    private Dog dog;

    public User(String name, Cat cat, Dog dog) {
        this.name = name;
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
