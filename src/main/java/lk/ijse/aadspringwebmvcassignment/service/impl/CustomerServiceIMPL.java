package lk.ijse.aadspringwebmvcassignment.service.impl;

import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;
import lk.ijse.aadspringwebmvcassignment.service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceIMPL implements CustomerService {
    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }

    @Override
    public Optional<CustomerDTO> findCustomer(String customerId) {
        return Optional.empty();
    }

    @Override
    public void deleteCustomer(String customerId) {

    }

    @Override
    public void updateCustomer(String customerId, CustomerDTO customerDTO) {

    }
}
