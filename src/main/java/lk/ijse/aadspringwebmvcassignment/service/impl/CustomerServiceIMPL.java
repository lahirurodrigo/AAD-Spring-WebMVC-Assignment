package lk.ijse.aadspringwebmvcassignment.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.aadspringwebmvcassignment.customerStatusCode.SelectedCustomerItemOrderErrorStatus;
import lk.ijse.aadspringwebmvcassignment.dao.CustomerDAO;
import lk.ijse.aadspringwebmvcassignment.dto.CustomerStatus;
import lk.ijse.aadspringwebmvcassignment.dto.impl.CustomerDTO;
import lk.ijse.aadspringwebmvcassignment.entity.impl.CustomerEntity;
import lk.ijse.aadspringwebmvcassignment.exception.CustomerNotFoundException;
import lk.ijse.aadspringwebmvcassignment.exception.DataPersistException;
import lk.ijse.aadspringwebmvcassignment.service.CustomerService;
import lk.ijse.aadspringwebmvcassignment.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public  void deleteCustomer(String customerId) {
        Optional<CustomerEntity> customerEntity = customerDAO.findById(customerId);
        if (!customerEntity.isPresent()) {
            throw new CustomerNotFoundException("Customer not found");
        }else{
            customerDAO.delete(customerEntity.get());
        }

    }

    @Override
    public void updateCustomer(String customerId, CustomerDTO customerDTO) {
        Optional<CustomerEntity> foundCustomer = customerDAO.findById(customerId);
        if (!foundCustomer.isPresent()) {
            throw new CustomerNotFoundException("Customer not found");
        }else{
            foundCustomer.get().setName(customerDTO.getName());
            foundCustomer.get().setAddress(customerDTO.getAddress());
            foundCustomer.get().setEmail(customerDTO.getEmail());
        }
    }
}
