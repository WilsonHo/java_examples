package design.pattern.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by baohg on 02/06/2016.
 */
public abstract class Circuit implements Equipment  {
    protected List<Equipment> equipments = new LinkedList<Equipment>();

    public void addEquipment(Equipment equipment) {
        if (equipment != null) {
            equipments.add(equipment);
        }
    }
}
