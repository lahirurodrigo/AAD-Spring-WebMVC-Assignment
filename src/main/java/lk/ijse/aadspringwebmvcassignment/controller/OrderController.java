package lk.ijse.aadspringwebmvcassignment.controller;

import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;
import lk.ijse.aadspringwebmvcassignment.dto.impl.OrderDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public class OrderController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderDTO saveOrder(@RequestBody OrderDTO orderDTO) {
        return orderDTO;
    }

    @GetMapping(value = "/{orderID}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getSelectedOrder(@PathVariable("orderID") String orderID){
        return null;
    }

    @DeleteMapping(value = "/{orderID}")
    public CustomerDTO deleteOrder(@PathVariable ("orderID") String orderID){
        return null;
    }

    @PutMapping(value = "/{orderID}")
    public CustomerDTO updateOrder(@PathVariable ("orderID") String orderID,
                                  @RequestBody CustomerDTO updatedOrderDTO){
        return null;
    }
}
