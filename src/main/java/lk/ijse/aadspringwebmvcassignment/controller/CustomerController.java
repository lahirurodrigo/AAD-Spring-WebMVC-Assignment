package lk.ijse.aadspringwebmvcassignment.controller;


import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController{

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDto) {
        return customerDto;
    }

    @GetMapping(value = "/{customerID}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getSelectedCustomer(@PathVariable ("customerID") String customerID){
        return null;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getALlCustomers(){
        return null;
    }

    @DeleteMapping(value = "/{customerID}")
    public CustomerDTO deleteCustomer(@PathVariable ("customerID") String customerID){
        return null;
    }

    @PutMapping(value = "/{customerID}")
    public CustomerDTO updateCustomer(@PathVariable ("customerID") String customerID,
                                           @RequestBody CustomerDTO updatedCustomerDTO){
        return null;
    }

}
