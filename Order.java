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
