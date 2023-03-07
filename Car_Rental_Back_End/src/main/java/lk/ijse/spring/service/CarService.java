package lk.ijse.spring.service;


import lk.ijse.spring.dto.CarDTO;

import java.util.ArrayList;

public interface CarService {
    void addCar(CarDTO dto);

    ArrayList<CarDTO> getAllCars();
}
