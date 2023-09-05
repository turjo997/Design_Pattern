package Singleton;

public class Main {

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance("Random Data");

        singletonObject.showMessage();
    }
}
