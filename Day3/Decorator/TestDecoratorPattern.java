package Day3.Decorator;

import java.text.DecimalFormat;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Decorator Pattern
 */
public class TestDecoratorPattern {
    private static DecimalFormat dformat;

    static {
        dformat = new DecimalFormat("#.##");
    }

    public static void main(String[] args) {
        Pizza pizza = new SimplyVegPizza();
        pizza = new RomaTomatoes(pizza);
        print(pizza);

        pizza = new GreenOlives(pizza);
        print(pizza);

        pizza = new Spinach(pizza);
        print(pizza);

        pizza = new SimplyNonVegPizza();
        print(pizza);

        pizza = new Meat(pizza);
        print(pizza);

        pizza = new Cheese(pizza);
        print(pizza);

        pizza = new Ham(pizza);
        print(pizza);
    }

    private static void print(Pizza pizza) {
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dformat.format(pizza.getPrice()));
    }
}
