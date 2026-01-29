package CoffeeShopStarbuzz;

public class DecafBase implements ICoffeeComponent{

    @Override
    public double cost() {
        return CoffeeIngredientsPrices.DECAF.getPrice();
    }

    @Override
    public String description(){
        return CoffeeIngredientsPrices.DECAF.getName();
    }

}
