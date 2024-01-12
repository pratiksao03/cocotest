import java.util.Random;

class Order {
    int orderNumber, weight;
    String city, pinCode;

    // Constructor to initialize an Order with random city and pinCode
    Order(int orderNumber, int weight) {
        this.orderNumber = orderNumber;
        this.weight = weight;
        // Generating random values for city and pinCode
        this.city = "City_" + (new Random().nextInt(5) + 1);
        this.pinCode = "Pin_" + (new Random().nextInt(2) + 1);
    }
}

public class OrderProcessor {

    // Display the details of a container
    private static void displayContainer(Order[] container) {
        System.out.printf("Container - City: %s, Pin Code: %s, Weight: %d kg%n",
                container[0].city, container[0].pinCode.isEmpty() ? "N/A" : container[0].pinCode, container[0].weight);
    }

    // Arrange orders into containers based on conditions
    private static void arrangeOrdersIntoContainers(Order[] orders) {
        int maxWeightPerContainer = 1000;
        Order[] currentContainer = null;

        // Loop through the orders
        for (Order order : orders) {
            // Check if a new container is needed
            if (currentContainer == null || 
                !order.city.equals(currentContainer[0].city) ||
                !order.pinCode.equals(currentContainer[0].pinCode) ||
                (currentContainer[0].weight + order.weight) > maxWeightPerContainer) {

                // Display the previous container if it exists
                if (currentContainer != null) {
                    displayContainer(currentContainer);
                }

                // Create a new container with a single slot
                currentContainer = new Order[1];
            }

            // Add the order to the current container and update its weight
            currentContainer[0] = order;
            currentContainer[0].weight += order.weight;
        }

        // Display the last container if it exists
        if (currentContainer != null) {
            displayContainer(currentContainer);
        }
    }

    public static void main(String[] args) {
        int numOrders = 1000;
        Order[] orders = new Order[numOrders];

        // Generate random orders
        for (int i = 1; i <= numOrders; i++) {
            orders[i - 1] = new Order(i, new Random().nextInt(100) + 1);
        }

        // Arrange orders into containers and display
        arrangeOrdersIntoContainers(orders);
    }
}
