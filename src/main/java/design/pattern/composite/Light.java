package design.pattern.composite;

/**
 * Created by baohg on 02/06/2016.
 */
public class Light implements Equipment {
    private static final int LIGHT_RESISTANCE = 10;
    private static final String LIGHT_NAME = "The light";

    public double getResistance() {
        return LIGHT_RESISTANCE;
    }

    public String getName() {
        return LIGHT_NAME;
    }
}
