package lk.ijse.aadspringwebmvcassignment.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.aadspringwebmvcassignment.customerStatusCode.SelectedCustomerItemOrderErrorStatus;
import lk.ijse.aadspringwebmvcassignment.dao.CustomerDAO;
import lk.ijse.aadspringwebmvcassignment.dto.CustomerStatus;
import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;
import lk.ijse.aadspringwebmvcassignment.entity.impl.CustomerEntity;
import lk.ijse.aadspringwebmvcassignment.exception.DataPersistException;
import lk.ijse.aadspringwebmvcassignment.service.CustomerService;
import lk.ijse.aadspringwebmvcassignment.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private Mapping customerMapping;
    @Override
    public void save(CustomerDTO customerDTO) {
        CustomerEntity savedCustomer = customerDAO.save(customerMapping.toCustomerEntity(customerDTO));
        if(savedCustomer == null){
            throw new DataPersistException("Customer not saved");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerMapping.toCustomerDTOList(customerDAO.findAll());
    }

    @Override
    public CustomerStatus findCustomer(String customerId) {
        if(customerDAO.existsById(customerId)){
            var selectedCustomer = customerDAO.getReferenceById(customerId);
            return customerMapping.toCustomerDTO(selectedCustomer);
        }else {
            return new SelectedCustomerItemOrderErrorStatus(2,"Selected customer not found");
        }
    }

    @Override
    public void deleteCustomer(String customerId) {

    }

    @Override
    public void updateCustomer(String customerId, CustomerDTO customerDTO) {

    }
}
