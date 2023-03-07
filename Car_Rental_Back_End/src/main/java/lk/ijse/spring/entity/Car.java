package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Car {
    @Id
    private String carId;
    private String brand;
    private String colour;
    private String type;
    private String fuelType;
    private String transmissionType;
    private int noOfPassengers;
    private double dailyRatePrice;
    private double monthlyRatePrice;
    private int freeKmPerDay;
    private int freeKmPerMonth;
    private double priceForExtraKM;
    private String availableOrNot;
    private String damageOrNot;
    private String underMaintainOrNot;
//    private String uploadBackView;
//    private String uploadSideView;
//    private String uploadInteriorView;
}
