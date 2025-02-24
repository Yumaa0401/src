public class Slice_o_Heaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;

    public Slice_o_Heaven(String storeName, String storeAddress, String storeEmail, long storePhone, String storeMenu) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = storeMenu;
    }

    public void takeOrder(String id, String pizzaIngredients, String sides, String drinks) {
        this.orderID = id;
        this.pizzaIngredients = pizzaIngredients;
        this.sides = sides;
        this.drinks = drinks;

        this.orderTotal = pizzaPrice;
        if (sides != null &&!sides.isEmpty()) {
            orderTotal += 10;
        }
        if (drinks != null &&!drinks.isEmpty()) {
            orderTotal += 5;
        }

        System.out.println("Order " + orderID + " accepted!");
        makePizza();
        printReceipt();
    }

    public void makePizza() {
        System.out.println("Making pizza with " + pizzaIngredients);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println("Pizza making was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        System.out.println("Pizza is ready!");
    }

    public void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Store Name: " + storeName);
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        if (sides != null &&!sides.isEmpty()) {
            System.out.println("Sides: " + sides);
        }
        if (drinks != null &&!drinks.isEmpty()) {
            System.out.println("Drinks: " + drinks);
        }
        System.out.println("Order Total: $" + orderTotal);
        System.out.println("***********************");
    }

    public static void main(String[] args) {
        Slice_o_Heaven pizzeria = new Slice_o_Heaven("Slice-o-Heaven", "123 Pizza St, City", "info@sliceoheaven.com", 1234567890L, "Pepperoni, Margherita, Hawaiian");
        pizzeria.pizzaPrice = 12.0;
        pizzeria.takeOrder("001", "Pepperoni, Cheese", "Garlic Bread", "Coke");
    }
}