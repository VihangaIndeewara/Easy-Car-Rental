package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.entity.Admin;

import java.util.ArrayList;

public interface AdminService {
    void addAdmin(AdminDTO dto);

    ArrayList<AdminDTO> getAllAdmin();
}
