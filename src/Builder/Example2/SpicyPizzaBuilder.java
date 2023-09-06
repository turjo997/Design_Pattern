package Builder.Example2;

public class SpicyPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private String topping;

    @Override
    public void buildDough() {
        this.dough = "Thick Crust";
    }

    @Override
    public void buildSauce() {
        this.sauce = "Spicy Tomato Sauce";
    }

    @Override
    public void buildTopping() {
        this.topping = "Pepperoni and Jalapeno";
    }

    @Override
    public Pizza getPizza() {
        return new SpicyPizza(dough, sauce, topping);
    }
}