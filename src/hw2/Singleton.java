package hw2;

public class Singleton {
    private Singleton(){
        System.out.println("Singleton initializ only once");
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if ( instance == null)
            instance = new Singleton();
        System.out.println("Singleton does not have copies");
        return instance;
    }

}
