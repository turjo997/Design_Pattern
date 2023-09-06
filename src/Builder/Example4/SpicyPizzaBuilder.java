package Builder.Example4;

public class SpicyPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildDough() {
        pizza.setDough("pan backed");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
         pizza.setTopping("peperoni+salami");
    }
}
