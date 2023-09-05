package Factory;

public class FactoryMain {
    public static void main(String[] args) {
          OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

          OS os = operatingSystemFactory.getInstance("Android");

          os.spec();
    }
}
