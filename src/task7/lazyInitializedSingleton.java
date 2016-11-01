package task7;

/**
 * Created by Dibox on 24.10.2016.
 */
public class lazyInitializedSingleton {
    private static lazyInitializedSingleton instance;
    private lazyInitializedSingleton(){
    }
   public static lazyInitializedSingleton getInstance(){
       if(instance == null){
           instance = new lazyInitializedSingleton();
       }
       return instance;
   }
}

enum EnumSingleton {

    Instance;
    public static void doSomething(){
        //do something
    }
}

class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton(){}
    public static Singleton getInstance() {
        return instance;
    }
}
