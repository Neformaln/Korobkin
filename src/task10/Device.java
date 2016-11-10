package task10;

/**
 * Created by Dibox on 10.11.2016.
 */
public abstract class Device extends OnOff implements Metods {
    String producer;
    int price;

    Device(String producer, int price) {
        this.producer = producer;
        this.price = price;
    }

    abstract Category getCategory();
}
