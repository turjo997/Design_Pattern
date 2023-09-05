package Factory;

public class OperatingSystemFactory {

    public OS getInstance(String str){
        if(str == null){
            return null;
        }
        if(str.equalsIgnoreCase("Android")){
            return new Android();

        } else if(str.equalsIgnoreCase("Windows")){
            return new Windows();

        } else if(str.equalsIgnoreCase("IOS")){
            return new IOS();
        }

        return null;
    }
}
