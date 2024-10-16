package lk.ijse.aadspringwebmvcassignment.dao;

import lk.ijse.aadspringwebmvcassignment.entity.impl.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDAO extends JpaRepository<ItemEntity, String> {
}
