package lk.ijse.aadspringwebmvcassignment.service.impl;

import lk.ijse.aadspringwebmvcassignment.dto.impl.ItemDTO;
import lk.ijse.aadspringwebmvcassignment.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceIMPL implements ItemService {
    @Override
    public ItemDTO save(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public List<ItemDTO> findAll() {
        return List.of();
    }

    @Override
    public Optional<ItemDTO> findById(String itemID) {
        return Optional.empty();
    }

    @Override
    public void delete(String itemID) {

    }

    @Override
    public void update(String itemID, ItemDTO itemDTO) {

    }
}
