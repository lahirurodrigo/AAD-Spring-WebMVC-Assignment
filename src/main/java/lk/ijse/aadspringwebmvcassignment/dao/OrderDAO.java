package lk.ijse.aadspringwebmvcassignment.dao;

import lk.ijse.aadspringwebmvcassignment.entity.impl.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<OrderEntity,String> {
}
