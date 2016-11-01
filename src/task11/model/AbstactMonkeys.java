package task11.model;

import java.util.List;

/**
 * Created by StudentTC on 01.11.2016.
 */
public abstract class AbstactMonkeys implements Calculation {
    private int numberOfFruits;

    public int calculate(Branch tree) {
        List<Fruit> fruits = tree.getFruits();

        for(Fruit fruit : fruits    ){
            if (isCalculatable(fruit)){
                numberOfFruits++;
            }
        }

        for (Branch branch : tree.getBrances() ){
            calculate(branch);
        }
        return numberOfFruits;
    }

    protected abstract boolean isCalculatable(Fruit fruit);

    public int getNumberOfFruits() {
        return numberOfFruits;
    }
}
