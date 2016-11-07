package task11.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class SmartMonkey extends AbstactMonkeys {
    private final List<String> TYPES = Arrays.asList("COCOS", "BANANA");


    @Override
    protected boolean isCalculatable(Fruit fruit) {
        return TYPE.equals(fruit.getType().name());
    }
}
