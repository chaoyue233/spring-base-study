package chaoyue.study.beans;

public class User {
    private String name;
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
