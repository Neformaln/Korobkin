package task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Dibox on 03.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Sphere[] s = new Sphere[3];

        s[0] = new Sphere(17, "green");
        s[1] = new Sphere(60, "yellow");
        s[2] = new Sphere(42, "red");


        System.out.println("============ no sorted ==============");

        for (Sphere i : s) {
            System.out.println("Name: " + i.getColor() +
                    " price: " + i.getSize());
        }


        System.out.println("========== sorted by price===========");

        Arrays.sort(s, new SortBySize());

        for (Sphere i : s) {
            System.out.println("Name: " + i.getColor() +
                    " price: " + i.getSize() +
                    " quantity: ");
        }


        System.out.println("========== sorted by name ===========");

        Arrays.sort(s, new SortByColor());
        for (Sphere i : s) {
            System.out.println("Name: " + i.getColor() +
                    " price: " + i.getSize() +
                    " quantity: ");
        }
    }
}




