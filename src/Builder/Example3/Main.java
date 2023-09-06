package Builder.Example3;

public class Main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder()
                .egg(true)
                .extraCheese(true)
                .mayonese(true)
                .onion(true)
                .size("23")
                .lettuce(true)
                .build();

        System.out.println(burger);

        //GOF Builder example

        VegMealBuilder vegMealBuilder = new VegMealBuilder();
        Meal meal = new MealDirector(vegMealBuilder).prepareMeal();
    }
}
