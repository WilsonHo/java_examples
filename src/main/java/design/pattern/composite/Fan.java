package design.pattern.composite;

/**
 * Created by baohg on 02/06/2016.
 */
public class Fan implements Equipment {
    private static final int FAN_RESISTANCE = 20;
    private static final String FAN_NAME = "The fan";

    public double getResistance() {
        return FAN_RESISTANCE;
    }

    public String getName() {
        return FAN_NAME;
    }
}
