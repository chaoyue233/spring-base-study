package chaoyue.study.beans;

public class OtherUser {
    private Cat cat;
    private Dog dog;

    public OtherUser(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "OtherUser{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
