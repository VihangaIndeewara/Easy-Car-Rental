package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addDriver(DriverDTO dto) {
        if (repo.existsById(dto.getDriverID())){
            throw new RuntimeException("Driver Id "+dto.getDriverID()+" Already Exit..");
        }
        Driver entity = mapper.map(dto, Driver.class);
        repo.save(entity);
    }
    @Override
    public ArrayList<DriverDTO> getAllDrivers() {
        List<Driver> all = repo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<DriverDTO>>(){}.getType());
    }

}
