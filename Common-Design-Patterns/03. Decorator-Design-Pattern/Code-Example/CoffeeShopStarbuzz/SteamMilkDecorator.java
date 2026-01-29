package CoffeeShopStarbuzz;

public class SteamMilkDecorator implements ICoffeeDecorator{

    private ICoffeeComponent baseCoffee;

    SteamMilkDecorator(ICoffeeComponent baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    @Override
    public double cost(){
        return baseCoffee.cost()+CoffeeIngredientsPrices.STEAMMILK.getPrice();
    }

    @Override
    public String description(){
        String prefix = " With ";
        if(baseCoffee instanceof ICoffeeDecorator) prefix = ", ";
        return baseCoffee.description() + prefix + CoffeeIngredientsPrices.STEAMMILK.getName();
    }

}
