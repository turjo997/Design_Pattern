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
        

        MealDirector mealDirector = new MealDirector();

        MealBuilder vegMealBuilder = new VegMealBuilder();


        mealDirector.setMealBuilder(vegMealBuilder);
        mealDirector.prepareMeal();

        Meal meal = mealDirector.getMeal();

        System.out.println(meal);
    }
}
