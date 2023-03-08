package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
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