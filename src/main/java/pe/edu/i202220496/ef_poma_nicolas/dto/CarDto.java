package pe.edu.i202220496.ef_poma_nicolas.dto;

public record CarDto(
        int carId,
        String make,
        String model,
        int year,
        String vin,
        String licensePlate
) {
}
