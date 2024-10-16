package lk.ijse.aadspringwebmvcassignment.controller;

import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;
import lk.ijse.aadspringwebmvcassignment.dto.impl.ItemDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ItemDTO saveItem(@RequestBody ItemDTO itemDTO) {
        return itemDTO;
    }

    @GetMapping(value = "/{itemID}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ItemDTO getSelectedItem(@PathVariable("itemID") String itemID){
        return  new ItemDTO();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ItemDTO> getALlItems(){
        return null;
    }

    @DeleteMapping(value = "/{itemID}")
    public ItemDTO deleteItem(@PathVariable ("itemID") String itemID){
        return new ItemDTO();
    }

    @PutMapping(value = "/{itemID}")
    public ItemDTO updateItem(@PathVariable ("itemID") String itemID,
                                  @RequestBody ItemDTO updatedItemDTO){
        return updatedItemDTO;
    }
}
