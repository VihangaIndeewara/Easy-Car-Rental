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
    private String cId;
    private String brand;
    private String colour;
    private String type;
    private String fuelType;
    private String transmissionType;
    private String noOfPassengers;
    private String dailyRatePrice;
    private String monthlyRatePrice;
    private String freeKmPerDay;
    private String freeKmPerMonth;
    private String priceForExtraKM;
    private String availableOrNot;
    private String damageOrNot;
    private String underMaintainOrNot;
    private String TotalDistanceTravelled;
//    private String uploadBackView;
//    private String uploadSideView;
//    private String uploadInteriorView;
}
