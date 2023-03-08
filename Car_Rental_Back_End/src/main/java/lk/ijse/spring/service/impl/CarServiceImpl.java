package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepo repo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void addCar(CarDTO dto) {
        if (repo.existsById(dto.getCarId())){
            throw new RuntimeException("Car Id "+dto.getCarId()+" Already Exit..");
        }
        Car entity = mapper.map(dto, Car.class);
        repo.save(entity);
    }

    @Override
    public void updateCar(CarDTO dto) {
        if (!repo.existsById(dto.getCarId())){
            throw new RuntimeException("Car Id "+dto.getCarId()+" Not Available");
        }

        Car entity = mapper.map(dto, Car.class);
        repo.save(entity);
    }

    @Override
    public void deleteCar(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Car Id "+id+" Not Available");
        }

        repo.deleteById(id);
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        List<Car> all = repo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<Car>>(){}.getType());
    }
}
