package design.pattern.factory;

/**
 * Created by baohg on 02/06/2016.
 */
public class Cat implements Pet {
    public Pet giveBirth() {
        return new Cat();
    }

    public void talk() {
        System.out.println("Mew Mew");
    }
}
