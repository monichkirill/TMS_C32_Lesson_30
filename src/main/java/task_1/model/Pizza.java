package task_1.model;

public class Pizza {
    private String size;
    private boolean chicken;
    private boolean beef;
    private boolean mushrooms;
    private boolean cheeseSauce;
    private boolean ketchup;

    public Pizza() {
    }

    public static class PizzaBuilder {
        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder setSize(String size) {
            pizza.size = size;
            return this;
        }

        public PizzaBuilder setChicken(boolean chicken) {
            pizza.chicken = chicken;
            return this;
        }


        public PizzaBuilder setBeef(boolean beef) {
            pizza.beef = beef;
            return this;
        }

        public PizzaBuilder setMushrooms(boolean mushrooms) {
            pizza.mushrooms = mushrooms;
            return this;
        }

        public PizzaBuilder setCheeseSauce(boolean cheeseSauce) {
            pizza.cheeseSauce = cheeseSauce;
            return this;
        }

        public PizzaBuilder setKetchup(boolean ketchup) {
            pizza.ketchup = ketchup;
            return this;
        }

        public Pizza buildPizza() {
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Your pizza:" + "\n" +
                "size='" + size + '\'' +
                ", chicken=" + chicken +
                ", beef=" + beef +
                ", mushrooms=" + mushrooms +
                ", cheese sauce=" + cheeseSauce +
                ", ketchup=" + ketchup;
    }
}
