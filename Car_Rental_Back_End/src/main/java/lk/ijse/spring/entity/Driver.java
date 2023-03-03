package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Driver {
    @Id
    private String driverID;
    private String driverName;
    private String driverAddress;
    private String driverContactNo;
    private String age;
    private String releaseStatus;
    private String driverUsername;
    private String driverPassword;
}
