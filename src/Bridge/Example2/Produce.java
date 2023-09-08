package Bridge.Example2;

public class Produce implements Workshop{
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
