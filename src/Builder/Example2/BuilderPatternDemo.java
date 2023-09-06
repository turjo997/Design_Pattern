package Builder.Example2;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        Pizza hawaiianPizza = waiter.constructPizza();
        System.out.println("Hawaiian Pizza:");
        System.out.println("Name: " + hawaiianPizza.getName());
        System.out.println("Dough: " + hawaiianPizza.getDough());
        System.out.println("Sauce: " + hawaiianPizza.getSauce());
        System.out.println("Topping: " + hawaiianPizza.getTopping());

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        Pizza spicyPizza = waiter.constructPizza();
        System.out.println("\nSpicy Pizza:");
        System.out.println("Name: " + spicyPizza.getName());
        System.out.println("Dough: " + spicyPizza.getDough());
        System.out.println("Sauce: " + spicyPizza.getSauce());
        System.out.println("Topping: " + spicyPizza.getTopping());
    }
}
