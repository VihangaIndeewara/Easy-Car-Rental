package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo repo;

    @Autowired
    ModelMapper mapper;



    @Override
    public void addCustomer(CustomerDTO dto) {
        if (repo.existsById(dto.getCustomerID())){
            throw new RuntimeException("Registration Id "+dto.getCustomerID()+" Already Exit..");
        }
        Customer entity = mapper.map(dto, Customer.class);
        repo.save(entity);
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (!repo.existsById(dto.getCustomerID())){
            throw new RuntimeException("Customer Id "+dto.getCustomerID()+" Not Available");
        }

        Customer entity = mapper.map(dto, Customer.class);
        repo.save(entity);
    }

    @Override
    public void deleteCustomer(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Customer Id "+id+" Not Available");
        }

        repo.deleteById(id);
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> all = repo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<Customer>>(){}.getType());
    }

    public String getLastCustomerId(){
        String lastId = repo.lastCustomerId();
        return lastId;

    }

}
