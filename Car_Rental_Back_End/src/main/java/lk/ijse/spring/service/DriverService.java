package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.DriverDTO;

import java.util.ArrayList;

public interface DriverService {
    void addDriver(DriverDTO dto);

    ArrayList<DriverDTO> getAllDrivers();
}
