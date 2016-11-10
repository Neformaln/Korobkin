package task10;

/**
 * Created by Dibox on 10.11.2016.
 */
public class MoreDevice extends Device implements Metods {
    public String name;
    MoreDevice(String producer, int price, String name) {
        super(producer, price);
        this.name = name;
    }

    @Override
    public void getPrice() {
        System.out.println(name+" стоит "+this.price+" рублей");
    }

    @Override
    public void getProducer() {
        System.out.println(name+" сделали в компании "+this.producer);

    }

    @Override
    Category getCategory() {
        return null;
    }

    public static void main(String[] args) {

        Device telephone = new MoreDevice("Samsung",3500,"Samphone");
        String name = MoreDevice.class.getSimpleName();
        Device pleer = new MoreDevice("Sven",750,"Audiosystem");
        telephone.swichOn();
        telephone.swichOff();
        telephone.getCategory();
        telephone.getPrice();
        telephone.getProducer();
        pleer.swichOn();
        pleer.swichOff();
        pleer.getCategory();
        pleer.getPrice();
        pleer.getProducer();

    }
}
