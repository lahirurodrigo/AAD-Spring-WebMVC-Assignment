package lk.ijse.aadspringwebmvcassignment.service.impl;

import lk.ijse.aadspringwebmvcassignment.dto.impl.OrderDTO;
import lk.ijse.aadspringwebmvcassignment.service.OrderService;

import java.util.List;

public class OrderServiceIMPL implements OrderService {
    @Override
    public OrderDTO add(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return List.of();
    }

    @Override
    public OrderDTO getOrder(String orderId) {
        return null;
    }

    @Override
    public void deleteOrder(String orderId) {

    }

    @Override
    public void updateOrder(String orderId, OrderDTO orderDTO) {

    }
}
