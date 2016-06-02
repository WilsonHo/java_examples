package design.pattern.factory;

/**
 * Created by baohg on 02/06/2016.
 */
public abstract class Me {
    public abstract Pet getMyPet();

    public void introduceMyPet(){
        Pet myPet = getMyPet();
        System.out.println("The parent pet talks:");
        myPet.talk();
        System.out.println("It's giving birth !!!");
        Pet child = myPet.giveBirth();
        System.out.println("The new born pet talks:");
        child.talk();
    }
}
