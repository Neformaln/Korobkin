package task11.model;

import java.util.List;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Branch {
    List<Branch> brances;
    List<Fruit> fruits;

    public List<Branch> getBrances() {
        return brances;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setBrances(List<Branch> brances) {
        this.brances = brances;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }
}
