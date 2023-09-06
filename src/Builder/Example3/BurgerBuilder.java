package Builder.Example3;

public class BurgerBuilder {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;


    public BurgerBuilder size(String size) {
        this.size = size;
        return this;
    }
    public BurgerBuilder egg(boolean egg) {
        this.egg = egg;
        return this;
    }
    public BurgerBuilder extraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }
    public BurgerBuilder mayonese(boolean mayonese) {
        this.mayonese = mayonese;
        return this;
    }
    public BurgerBuilder onion(boolean onion) {
        this.onion = onion;
        return this;
    }
    public BurgerBuilder lettuce(boolean lettuce) {
        this.lettuce = lettuce;
        return this;
    }


    public Burger build() {

        return new Burger(size,egg,extraCheese,mayonese,onion,lettuce);
    }
}
