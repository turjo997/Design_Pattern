package Builder.Example3;

public class Burger {
    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    public Burger(String size, boolean egg, boolean extraCheese, boolean mayonese, boolean onion, boolean lettuce) {
        this.size = size;
        this.egg = egg;
        this.extraCheese = extraCheese;
        this.mayonese = mayonese;
        this.onion = onion;
        this.lettuce = lettuce;
    }

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg=" + egg +
                ", extraCheese=" + extraCheese +
                ", mayonese=" + mayonese +
                ", onion=" + onion +
                ", lettuce=" + lettuce +
                '}';
    }
}
