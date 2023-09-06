package Builder;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        VegBurger vegBurger = new VegBurger();
        //meal.addItem(new VegBurger());
        meal.addItem(vegBurger);
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        ChickenBurger chickenBurger = new ChickenBurger();

        meal.addItem(chickenBurger);
        //meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
