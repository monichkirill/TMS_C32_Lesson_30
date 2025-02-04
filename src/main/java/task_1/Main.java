package task_1;

import task_1.model.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size (small, medium, large): ");
            String size = scanner.nextLine();
            System.out.println("Do you want to add chicken to your pizza? (true/false): ");
            boolean chicken = scanner.nextBoolean();
            System.out.println("Do you want to add beef to your pizza? (true/false): ");
            boolean beef = scanner.nextBoolean();
            System.out.println("Do you want to add mushrooms to your pizza? (true/false): ");
            boolean mushroom = scanner.nextBoolean();
            System.out.println("Do you want to add cheese sauce to your pizza? (true/false):");
            boolean cheese = scanner.nextBoolean();
            System.out.println("Do you want to add ketchup to your pizza? (true/false):");
            boolean ketchup = scanner.nextBoolean();

            Pizza yourPizza = new Pizza.PizzaBuilder()
                    .setSize(size)
                    .setChicken(chicken)
                    .setBeef(beef)
                    .setMushrooms(mushroom)
                    .setCheeseSauce(cheese)
                    .setKetchup(ketchup)
                    .buildPizza();

            System.out.println(yourPizza.toString());
        }
    }
}
