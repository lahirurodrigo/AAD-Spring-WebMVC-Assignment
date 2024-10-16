package lk.ijse.aadspringwebmvcassignment.service;

import lk.ijse.aadspringwebmvcassignment.dto.impl.ItemDTO;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    ItemDTO save(ItemDTO itemDTO);
    List<ItemDTO> findAll();
    Optional<ItemDTO> findById(String itemID);
    void delete(String itemID);
    void update(String itemID, ItemDTO itemDTO);
}
