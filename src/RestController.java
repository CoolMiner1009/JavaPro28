import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestController {
    private OrderRepository orderRepository = new OrderRepository();

    // Отримання конкретного замовлення за ID
    public Order getOrder(int orderId) {
        return orderRepository.getOrderById(orderId);
    }

    // Отримання всіх замовлень
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    // Додавання нового замовлення
    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }
}