package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService service;

    @PostMapping
    public ResponseUtil saveAdmin(AdminDTO dto){
        service.addAdmin(dto);
        return new ResponseUtil("200","Successfully Added",null);
    }

    @GetMapping
    public ResponseUtil getAllAdmin(){
        ArrayList<AdminDTO> allAdmin = service.getAllAdmin();
        return new ResponseUtil("200","Success",allAdmin);
    }

    @PutMapping
    public ResponseUtil updateAdmin(@RequestBody AdminDTO dto){
        service.updateAdmin(dto);
        return new ResponseUtil("200","Successfully Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteAdmin(String id){
        service.deleteAdmin(id);
        return new ResponseUtil("200","Successfully Deleted",null);
    }
}
