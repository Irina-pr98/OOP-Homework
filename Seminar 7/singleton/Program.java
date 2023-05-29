package singleton;

public class Program {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();
    }
}