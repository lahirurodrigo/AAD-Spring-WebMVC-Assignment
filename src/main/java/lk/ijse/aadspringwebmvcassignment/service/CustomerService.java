package lk.ijse.aadspringwebmvcassignment.service;

import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    CustomerDTO save(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    Optional<CustomerDTO> findCustomer(String customerId);
    void deleteCustomer(String customerId);
    void updateCustomer(String customerId, CustomerDTO customerDTO);
}
