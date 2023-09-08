package Bridge.Example3;

public class TVRemoteControl extends RemoteControl{
    private int currentChannel = 1;

    public TVRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
       device.turnOff();
    }

    @Override
    public void nextChannel() {
        currentChannel++;
        device.setChannel(currentChannel);
    }

    @Override
    public void previousChannel() {
        currentChannel--;
        device.setChannel(currentChannel);
    }
}
