import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OrderRepository {
    private Map<Integer, Order> orders = new HashMap<>();

    // Метод отримання замовлення за ID
    public Order getOrderById(int orderId) {
        return orders.get(orderId);
    }

    // Метод отримання всіх замовлень
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    // Метод додавання замовлення
    public void addOrder(Order order) {
        orders.put(order.getId(), order);
    }
}
