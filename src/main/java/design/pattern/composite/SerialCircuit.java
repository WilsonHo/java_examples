package design.pattern.composite;

/**
 * Created by baohg on 02/06/2016.
 */
public class SerialCircuit extends Circuit {
    private static final String CIRCUIT_NAME = "Parallel Circuit";

    public double getResistance() {
        double temp = 0;
        for (Equipment e : equipments) {
            temp += e.getResistance();
        }
        return temp;
    }

    public String getName() {
        return CIRCUIT_NAME;
    }
}
