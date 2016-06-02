package design.pattern.composite;

/**
 * Created by baohg on 02/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * /---light--------fan-----------/ ------fan------ -light---fan---
         */
        SerialCircuit rootCircuit = new SerialCircuit();
        rootCircuit.addEquipment(new Light());


        ParallelCircuit childCircuit = new ParallelCircuit();
        childCircuit.addEquipment(new Fan());
        childCircuit.addEquipment(new Fan());


        SerialCircuit childOfChildCircuit = new SerialCircuit();
        childOfChildCircuit.addEquipment(new Light());
        childOfChildCircuit.addEquipment(new Fan());


        childCircuit.addEquipment(childOfChildCircuit);


        rootCircuit.addEquipment(childCircuit);

        System.out.println("Total resistance = " + rootCircuit.getResistance());
    }
}
