package CoffeeShopStarbuzz;

public class Main {
    public static void main(String[] args) {
        ICoffeeComponent decaf = new DecafBase();
        ICoffeeComponent mochaAddCoffee = new MochaDecorator(decaf);
        ICoffeeComponent steamMilkAddCoffee = new SteamMilkDecorator(mochaAddCoffee);
        ICoffeeComponent whipAddCoffee = new WhipDecorator(steamMilkAddCoffee);
        ICoffeeComponent mochaAddCoffee2 = new MochaDecorator(whipAddCoffee);

        System.out.println("Description: " + mochaAddCoffee2.description());
        System.out.println("Cost: " + mochaAddCoffee2.cost());
    }
}
