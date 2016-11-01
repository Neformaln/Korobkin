package task11.service;

import task11.model.BananaMonkey;
import task11.model.Branch;
import task11.model.Calculation;
import task11.model.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class MonkeyService {
    public static void main(String[] args){
        Branch tree = createTree(FruitType.COCOS.name());

        Calculation monkey = new BananaMonkey();

        int result = calculate(monkey, tree;





    }
    public int calculate(Calculation monkey, Branch tree){
        return monkey.calculate(tree);
    }
    public static Branch createTree(String type) {
        Branch tree = new Branch();
        List<Branch> children = new ArrayList();

        for(int i = 0; i<4; i++){
            Branch child = createTree(new Branch(), type);
            children.add(child);
        }

        tree.setBrances(children);

        List<Fruit> fruits = new ArrayList<>();

        for (int i = 1; i < 10; i++){
            fruits.add(new Fruit("cocos"));
        }
        for(int i = 1; i < 5; i++){
            fruits.add(new Fruit("banana"));
        }

        tree.setFruits(fruits);
        tree.setFruits(fruits);
        tree.setFruits(fruits);
        tree.setFruits(fruits);

        return tree;
    }

    public enum FruitType{
        COCOS,
        BANANA;
    }

    public static Branch createTree(Branch tree, String type){
        Branch child1 = new Branch();
        Branch child2 = new Branch();
        Branch child3 = new Branch();

        List<Branch> children = new ArrayList<>();
        tree.setBrances(children);
        return tree;

    }
}
