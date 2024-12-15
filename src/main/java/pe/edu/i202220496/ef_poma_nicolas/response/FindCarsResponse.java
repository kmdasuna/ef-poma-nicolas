package pe.edu.i202220496.ef_poma_nicolas.response;

import pe.edu.i202220496.ef_poma_nicolas.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}
