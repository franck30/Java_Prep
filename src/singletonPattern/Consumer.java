package singletonPattern;

public class Consumer {
    private static Singleton singleton1;
    private static Singleton singleton2;
    private static Singleton singleton3;
    private static Singleton singleton4;
    public static void main(String[] args) {
        singleton1=Singleton.getInstance();
        singleton2=Singleton.getInstance();
        singleton3=Singleton.getInstance();
        singleton4=Singleton.getInstance();


    }
}
