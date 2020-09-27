package pl.sda.hellospring.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CarRepository extends CrudRepository<Car, Long> {

    Optional<Car> findByBrandAndColor(String brand, String color);
}