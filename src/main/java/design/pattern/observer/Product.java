package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baohg on 01/06/2016.
 */
public class Product implements ISubject {
    private List<IObserver> obs = new ArrayList<IObserver>();
    private String nameProduct;
    private String message;

    public Product(String nameProduct) {
        super();
        this.nameProduct = nameProduct;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void attachObserver(IObserver observer) {
        obs.add(observer);
    }

    public void detachObserver(IObserver observer) {
        obs.remove(observer);
    }

    public void notifyObserver() {
        for (IObserver ob : obs) {
            ob.update(nameProduct + " " + message);
        }
    }
}
