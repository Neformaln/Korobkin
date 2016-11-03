package task9;

import javax.script.Compilable;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Dibox on 02.11.2016.
 */


class SortByColor implements Comparator<Sphere> {

        public int compare(Sphere sphere1, Sphere sphere2) {

            String a1 = sphere1.getColor();
            String a2 = sphere2.getColor();

            return a1.compareTo(a2);
        }
    }

class SortBySize implements Comparator<Sphere> {

    public int compare(Sphere sphere1, Sphere sphere2) {
        int sphere1Size = sphere1.getSize();
        int sphere2Size = sphere2.getSize();

        if (sphere1Size > sphere2Size) {
            return 1;
        } else if (sphere1Size < sphere2Size) {
            return -1;
        } else {
            return 0;
        }
    }
}





