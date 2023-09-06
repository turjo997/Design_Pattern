package Builder.Example2;

public class HawaiianPizza implements Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public HawaiianPizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String getName() {
        return "Hawaiian Pizza";
    }

    @Override
    public String getDough() {
        return dough;
    }

    @Override
    public String getSauce() {
        return sauce;
    }

    @Override
    public String getTopping() {
        return topping;
    }
}
