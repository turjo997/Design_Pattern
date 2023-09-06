package Builder.Example4;

public class Main {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println(pizza);
    }
}
