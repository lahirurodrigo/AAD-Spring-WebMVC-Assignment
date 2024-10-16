package lk.ijse.aadspringwebmvcassignment.controller;


import lk.ijse.aadspringwebmvcassignment.dto.CustomerStatus;
import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;
import lk.ijse.aadspringwebmvcassignment.exception.DataPersistException;
import lk.ijse.aadspringwebmvcassignment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController{
    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveCustomer(@RequestBody CustomerDTO customerDto) {
        try {
            customerService.save(customerDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (DataPersistException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{customerID}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerStatus getSelectedCustomer(@PathVariable ("customerID") String customerID){
        return customerService.findCustomer(customerID);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getALlCustomers(){
        return customerService.getAllCustomers();
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
