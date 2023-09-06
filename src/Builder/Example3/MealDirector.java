package Builder.Example3;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public Meal prepareMeal() {
        mealBuilder.addBread();
        mealBuilder.addBriyani();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink();
        return mealBuilder.build();
    }
}
