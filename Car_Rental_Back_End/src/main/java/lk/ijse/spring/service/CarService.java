package lk.ijse.spring.service;


import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CarDTO;

import java.util.ArrayList;

public interface CarService {
    void addCar(CarDTO dto);
    void updateCar(CarDTO dto);
    ArrayList<CarDTO> getAllCars();
}
