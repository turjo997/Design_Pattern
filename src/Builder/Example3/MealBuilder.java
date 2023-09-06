package Builder.Example3;


import Builder.Example4.Pizza;

public abstract class MealBuilder {

    protected Meal meal;

    public void createNewMealProduct(){
        meal = new Meal();
    }

    public Meal getMeal(){
        return meal;
    }



    public abstract void addBriyani();
    public  abstract  void  addBread();
    public abstract void  addColdDrink();
    public abstract void addCurry();



}
