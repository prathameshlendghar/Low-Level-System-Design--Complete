package CoffeeShopStarbuzz;

public class MochaDecorator implements ICoffeeDecorator {

    private ICoffeeComponent baseCoffee;

    MochaDecorator(ICoffeeComponent baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public double cost() {
        return baseCoffee.cost() + CoffeeIngredientsPrices.MOCHA.getPrice();
    }

    @Override
    public String description() {
        String prefix = " With ";
        if (baseCoffee instanceof ICoffeeDecorator) prefix = ", ";
        return baseCoffee.description() + prefix + CoffeeIngredientsPrices.MOCHA.getName();
    }
};