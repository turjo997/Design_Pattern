package Bridge.Example3;

public class TV implements Device{

    private int channel = 1;
    private boolean isOn = false;


    @Override
    public void turnOn() {
        System.out.println("Turning on the TV");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV");
        isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        if (isOn) {
            this.channel = channel;
            System.out.println("Setting TV channel to " + channel);
        } else {
            System.out.println("Cannot set channel. TV is off.");
        }
    }
}
