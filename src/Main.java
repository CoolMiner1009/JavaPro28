import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RestController restController = new RestController();

        // Додавання нового замовлення
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product 1", 10.0));
        products.add(new Product(2, "Product 2", 15.0));
        Order newOrder = new Order(1, "2023-09-18", 25.0, products);
        restController.addOrder(newOrder);

        // Отримання конкретного замовлення за ID
        Order orderById = restController.getOrder(1);
        if (orderById != null) {
            System.out.println("Order by ID: " + orderById.getId());
        } else {
            System.out.println("Order not found by ID");
        }

        // Отримання всіх замовлень
        List<Order> allOrders = restController.getAllOrders();
        System.out.println("All Orders:");
        for (Order order : allOrders) {
            System.out.println("Order ID: " + order.getId());
        }
    }
}
