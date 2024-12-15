package pe.edu.i202220496.ef_poma_nicolas.service;

import pe.edu.i202220496.ef_poma_nicolas.dto.CarDetailDto;
import pe.edu.i202220496.ef_poma_nicolas.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;

}
