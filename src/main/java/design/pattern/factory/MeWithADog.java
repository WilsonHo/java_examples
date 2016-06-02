package design.pattern.factory;

/**
 * Created by baohg on 02/06/2016.
 */
public class MeWithADog extends Me {
    @Override
    public Pet getMyPet() {
        return  new Dog();
    }
}
