package CoffeeShopStarbuzz;

public class EspressoBase implements ICoffeeComponent{

    @Override
    public double cost() {
        return CoffeeIngredientsPrices.ESPRESSO.getPrice();
    }

    @Override
    public String description(){
        return CoffeeIngredientsPrices.ESPRESSO.getName();
    }
}