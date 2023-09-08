package Bridge.Example3;

public class DVDPlayer implements Device{

    private boolean isOn = false;

    @Override
    public void turnOn() {
        System.out.println("Turning on the DVD Player");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the DVD Player");
        isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Player does not have channels.");
    }
}
