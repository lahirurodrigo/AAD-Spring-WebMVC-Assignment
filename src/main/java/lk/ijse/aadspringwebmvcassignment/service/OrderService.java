package lk.ijse.aadspringwebmvcassignment.service;

import lk.ijse.aadspringwebmvcassignment.dto.impl.OrderDTO;

import java.util.List;

public interface OrderService {
    OrderDTO add(OrderDTO orderDTO);
    List<OrderDTO> getAllOrders();
    OrderDTO getOrder(String orderId);
    void deleteOrder(String orderId);
    void updateOrder(String orderId, OrderDTO orderDTO);
}
