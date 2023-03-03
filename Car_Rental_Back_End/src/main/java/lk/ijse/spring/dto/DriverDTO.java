package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriverDTO {
    private String driverID;
    private String driverName;
    private String driverAddress;
    private String driverContactNo;
    private String age;
    private String releaseStatus;
    private String driverUsername;
    private String driverPassword;
}
