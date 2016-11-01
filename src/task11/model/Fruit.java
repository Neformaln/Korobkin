package task11.model;

import task11.service.MonkeyService;

import java.lang.reflect.Type;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Fruit {
    private final MonkeyService.FruitType type;

    public Fruit(String type) {
        this.type = MonkeyService.FruitType.valueOf(type);
    }

    public MonkeyService.FruitType getType() {
        return type;
    }

}
