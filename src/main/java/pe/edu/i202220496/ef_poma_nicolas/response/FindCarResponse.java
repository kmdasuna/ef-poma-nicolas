package pe.edu.i202220496.ef_poma_nicolas.response;

import pe.edu.i202220496.ef_poma_nicolas.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto car) {
}
