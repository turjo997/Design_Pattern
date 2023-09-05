package Singleton;

public class SingletonObject {
    // Private static instance variable
    private static SingletonObject instance;

    // Private instance variables to initialize in the constructor
    private String someData;


    private SingletonObject(String initData){
        this.someData = initData;
    }

    public static SingletonObject getInstance(String initData){
        if (instance == null) {
            instance = new SingletonObject(initData);
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello, I am a Singleton with data: " + someData);
    }
}
