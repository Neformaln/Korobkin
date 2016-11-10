package task10;

/**
 * Created by Dibox on 10.11.2016.
 */
public class Vidic extends Device implements Metods {

    Vidic(String producer, int price) {
        super(producer, price);
    }

    @Override
    public void getPrice() {
        System.out.println("Giv me for this "+this.price+" $$$");

    }

    @Override
    public void getProducer() {
        System.out.println("Made in "+this.producer);

    }

    @Override
    Category getCategory() {
        return Category.Video;
    }

    public static void main(String[] args) {
        Device vidic = new Vidic("Gyan'Goy",666);
        String name = Vidic.class.getSimpleName();
        vidic.getPrice();
        vidic.getProducer();
        vidic.getCategory();
        vidic.swichOn();
        vidic.swichOff();

    }

}
