package task9;



/**
 * Created by Dibox on 01.11.2016.
 * сделать класс Sphere и SphereService, который имеет методы sortByColor(Sphere[] spheres) и sortBySize(Sphere[] spheres)
 */
class Sphere {

    private int size;
    private String color;

    public Sphere(int size, String color) {

        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
