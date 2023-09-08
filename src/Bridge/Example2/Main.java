package Bridge.Example2;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car(new Produce() , new Assemble());
        Vehicle bike = new Bike(new Produce() , new Assemble());


        car.manufacture();
        System.out.println();
        bike.manufacture();
    }
}
