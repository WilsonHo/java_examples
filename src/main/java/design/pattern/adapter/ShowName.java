package design.pattern.adapter;

/**
 * Created by baohg on 01/06/2016.
 */
public class ShowName implements IShowName {
    public void showName(String name) {
        System.out.println(this.standardize(name));
    }

    private String standardize(String name) {
        String result = "hello " + name.trim();
        return result;
    }
}
