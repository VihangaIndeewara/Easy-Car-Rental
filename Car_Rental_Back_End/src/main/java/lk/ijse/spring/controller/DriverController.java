package lk.ijse.spring.controller;


import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/driver")
@CrossOrigin
public class DriverController {
    @Autowired
    DriverService service;

    @PostMapping
    public ResponseUtil saveDriver(DriverDTO dto){
        service.addDriver(dto);
        return new ResponseUtil("200","Successfully Added",null);
    }

    @GetMapping
    public ResponseUtil getAllDrivers(){
        ArrayList<DriverDTO> allDrivers = service.getAllDrivers();
        return new ResponseUtil("200","Success",allDrivers);
    }

    @PutMapping
    public ResponseUtil updateDriver(@RequestBody DriverDTO dto){
        service.updateDriver(dto);
        return new ResponseUtil("200","Successfully Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteDriver(String id){
        service.deleteDriver(id);
        return new ResponseUtil("200","Successfully Deleted",null);
    }

}
