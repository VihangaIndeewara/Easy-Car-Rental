package lk.ijse.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
    @Id
    private String customerID;
    private String customerName;
    private String customerUsername;
    private String customerPassword;
    private String customerAddress;
    private String customerContactNo;
    private String customerEmail;
    private String customerNICNo;
    private String customerLicenseNo;
}
