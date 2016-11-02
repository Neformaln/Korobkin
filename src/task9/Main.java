package task9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dibox on 03.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(17, "green");
        Sphere sphere2 = new Sphere(60, "yellow");
        Sphere sphere3 = new Sphere(42, "red");

        ArrayList<Sphere> al = new ArrayList<Sphere>();
        al.add(sphere1);
        al.add(sphere2);
        al.add(sphere3);

        Collections.sort(al, new SizeComparator());
        for (Sphere a : al) {
            System.out.println(a.getColor());
        }
    }

}

