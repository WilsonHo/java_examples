package design.pattern.observer;

/**
 * Created by baohg on 01/06/2016.
 */
public class Customer implements IObserver {
    private String name;
    private int age;

    public Customer(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void update(String message) {
        System.out.println(name + " " + message);
    }
}