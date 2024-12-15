package pe.edu.i202220496.ef_poma_nicolas.dto;

import java.util.Date;

public record CarDetailDto(
        int carId,
        String make,
        String model,
        int year,
        String vin,
        String licensePlate,
        String ownerName,
        String ownerContact,
        Date purchaseDate,
        int mileage,
        String engineType,
        String color,
        String insuranceCompany,
        String insurancePolicyNumber,
        Date registrationExpirationDate,
        Date serviceDueDate
) {
}
