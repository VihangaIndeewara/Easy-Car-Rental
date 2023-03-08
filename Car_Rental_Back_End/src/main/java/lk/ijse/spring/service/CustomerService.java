package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {
    void addCustomer(CustomerDTO dto);
    void updateCustomer(CustomerDTO dto);
    ArrayList<CustomerDTO> getAllCustomers();
}