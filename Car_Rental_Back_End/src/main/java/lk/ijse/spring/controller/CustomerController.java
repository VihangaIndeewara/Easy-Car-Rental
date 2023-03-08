package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping
    public ResponseUtil saveCustomer(CustomerDTO dto){
        service.addCustomer(dto);
        return new ResponseUtil("200","Your Registration is Successfully.. Please Login As Customer..!",null);
    }

    @GetMapping
    public ResponseUtil getAllCustomers(){
        ArrayList<CustomerDTO> allCustomers = service.getAllCustomers();
        return new ResponseUtil("200","Success",allCustomers);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        service.updateCustomer(dto);
        return new ResponseUtil("200","Successfully Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteDriver(String id){
        service.deleteCustomer(id);
        return new ResponseUtil("200","Successfully Deleted",null);
    }
//
//    @GetMapping
//    public ResponseUtil lastCustomerId(){
//        String lastCustomerId = service.getLastCustomerId();
//        return new ResponseUtil("200","Success",lastCustomerId);
//    }

}
