package pe.edu.i202220496.ef_poma_nicolas.repository;

import pe.edu.i202220496.ef_poma_nicolas.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
