package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addAdmin(AdminDTO dto) {
        if (repo.existsById(dto.getId())){
            throw new RuntimeException("Admin Id "+dto.getId()+" Already Exit..");
        }
        Admin entity = mapper.map(dto, Admin.class);
        repo.save(entity);
    }

    @Override
    public ArrayList<AdminDTO> getAllAdmin() {
        List<Admin> all = repo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<AdminDTO>>(){}.getType());
    }
}
