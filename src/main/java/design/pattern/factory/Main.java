package design.pattern.factory;

/**
 * Created by baohg on 02/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("once upon a time !!!");
        Me me = new MeWithACat();
        me.introduceMyPet();

        System.out.println();
        System.out.println("At present");
        me = new MeWithADog();
        me.introduceMyPet();
    }
}
