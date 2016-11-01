package task11.model;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class CocosMonkey  extends AbstactMonkeys {
    private final String TYPE = "COCOS";

    @Override
    protected boolean isCalculatable(Fruit fruit) {
        return TYPE.equals(fruit.getType().name());
}
