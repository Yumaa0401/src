public class Slice_o_Heaven {
    public String storeAddress;
    private String menu;
    public String storeHours;
    public long storePhoneNumber;
    public String storeEmail;
    public String storeWebsite;

    private String orderID;
    private String orderDetails;
    private String orderStatus;
    private double orderTotal;

    public void takeOrder(String id, String details, double total) {
        orderID = id;
        orderDetails = details;
        orderTotal = total;

        System.out.println("Order accepted!");
        System.out.println("Order is being prepared");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Order preparation was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Your order is ready!");
        printReceipt();
    }

    private void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Details: " + orderDetails);
        System.out.println("Order Total: " + orderTotal);
    }
    public static void main(String[] args) {
        Slice_o_Heaven pizzaStore = new Slice_o_Heaven();
        pizzaStore.takeOrder("123", "Large Pepperoni Pizza", 15.99);
    }
}