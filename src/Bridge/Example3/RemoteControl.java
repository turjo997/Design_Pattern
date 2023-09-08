package Bridge.Example3;

public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();

//    public void turnOn() {
//        device.turnOn();
//    }
//
//    public void turnOff() {
//        device.turnOff();
//    }

    public abstract void nextChannel();

    public abstract void previousChannel();
}
