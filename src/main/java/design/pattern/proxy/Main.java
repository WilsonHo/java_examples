package design.pattern.proxy;

/**
 * Created by baohg on 01/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        UserProxy user1 = new UserProxy("ok");
        System.out.println(user1.readFile());
        UserProxy user2 = new UserProxy("hello");
        System.out.println(user2.readFile());
    }
}
