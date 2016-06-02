package design.pattern.factory;

/**
 * Created by baohg on 02/06/2016.
 */
public class Dog implements Pet {
    public Pet giveBirth() {
        return new Dog();
    }

    public void talk() {
        System.out.println("Wolf Wolf");
    }
}
