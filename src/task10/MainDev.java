package task10;

/**
 * Created by Dibox on 10.11.2016.
 */
public class MainDev extends Device implements Metods {
    public String name;
    MainDev(String producer, int price, String name) {
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

        Device telephone = new MainDev("Samsung",3500,"Samphone");
        String name = MainDev.class.getSimpleName();
        Device pleer = new MainDev("Sven",750,"Audiosystem");
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
