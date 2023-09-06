package Builder.Example3;

import Builder.Example4.Pizza;

public class MealDirector {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal(){
        return mealBuilder.getMeal();
    }


    public void prepareMeal() {
        mealBuilder.createNewMealProduct();
        mealBuilder.addBread();
        mealBuilder.addBriyani();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink();
    }
}
