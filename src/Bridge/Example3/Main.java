package Bridge.Example3;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new TVRemoteControl(tv);

        Device dvdPlayer = new DVDPlayer();
        RemoteControl dvdRemote = new TVRemoteControl(dvdPlayer);

        tvRemote.turnOn();
        tvRemote.nextChannel();
        tvRemote.nextChannel();
        tvRemote.turnOff();

        dvdRemote.turnOn();
        dvdRemote.turnOff();
    }
}
