package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepo repo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void addCar(CarDTO dto) {
        if (repo.existsById(dto.getCId())){
            throw new RuntimeException("Admin Id "+dto.getCId()+" Already Exit..");
        }
        Car entity = mapper.map(dto, Car.class);
        repo.save(entity);
    }
}
