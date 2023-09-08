package Bridge.Example2;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.print(" And");
        System.out.print(" Assembled.");
    }
}
