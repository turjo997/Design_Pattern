package Builder.Example2;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private String topping;

    @Override
    public void buildDough() {
        this.dough = "Thin Crust";
    }

    @Override
    public void buildSauce() {
        this.sauce = "Tomato Sauce";
    }

    @Override
    public void buildTopping() {
        this.topping = "Ham and Pineapple";
    }

    @Override
    public Pizza getPizza() {
        return new HawaiianPizza(dough, sauce, topping);
    }
}
