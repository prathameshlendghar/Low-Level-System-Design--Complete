package CoffeeShopStarbuzz;

public class WhipDecorator implements ICoffeeDecorator {
    private ICoffeeComponent baseCoffee;

    WhipDecorator(ICoffeeComponent baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public double cost() {
        return baseCoffee.cost() + CoffeeIngredientsPrices.WHIP.getPrice();
    }

    @Override
    public String description() {
        String prefix = " With ";
        if (baseCoffee instanceof ICoffeeDecorator) prefix = ", ";
        return baseCoffee.description() + prefix + CoffeeIngredientsPrices.WHIP.getName();
    }
};
