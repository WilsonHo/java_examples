package design.pattern.composite;

/**
 * Created by baohg on 02/06/2016.
 */
public class ParallelCircuit extends Circuit {
    private static final String CIRCUIT_NAME = "Parallel Circuit";

    public double getResistance() {
        double temp = 0;
        for (Equipment e : equipments) {
            temp += 1.0 / e.getResistance();
        }
        return 1.0 / temp;
    }

    public String getName() {
        return CIRCUIT_NAME;
    }
}
