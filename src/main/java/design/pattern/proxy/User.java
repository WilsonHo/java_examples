package design.pattern.proxy;

/**
 * Created by baohg on 01/06/2016.
 */
public class User implements IReadFile {
    private String name; // Tên của người dùng

    public User(String name) {
        this.name = name;
    }

    public String readFile() {
        return name + " readed!";
    }
}
