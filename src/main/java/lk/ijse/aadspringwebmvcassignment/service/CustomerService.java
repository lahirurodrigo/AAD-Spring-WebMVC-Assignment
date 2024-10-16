package lk.ijse.aadspringwebmvcassignment.service;

import lk.ijse.aadspringwebmvcassignment.dto.CustomerStatus;
import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void save(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    CustomerStatus findCustomer(String customerId);
    void deleteCustomer(String customerId);
    void updateCustomer(String customerId, CustomerDTO customerDTO);
}
