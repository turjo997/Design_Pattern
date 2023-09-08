package Bridge.Example2;

public class Car extends Vehicle{

    public Car(Workshop workshop1 , Workshop workshop2){
             super(workshop1 , workshop2);
    }
    @Override
    public void manufacture() {
        System.out.print("Car : ");

        workShop1.work();
        workShop2.work();
    }
}
