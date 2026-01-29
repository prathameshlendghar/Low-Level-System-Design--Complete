package CoffeeShopStarbuzz;

public enum CoffeeIngredientsPrices {
    ESPRESSO("Espresso", 5),
    HOUSEBLEND("HouseBlend", 10),
    DARKROAST("DarkRoast", 15),
    DECAF("Decaf", 9),
    STEAMMILK("SteamMilk", 5),
    MOCHA("Mocha", 3),
    SOY("Soy", 9),
    WHIP("Whip", 9);

    private final double price;
    private final String name;

    CoffeeIngredientsPrices(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice() {
        return price;
    }
}
