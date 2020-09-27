package pl.sda.hellospring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.hellospring.dto.CarDto;
import pl.sda.hellospring.service.CarService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/cars")
public class CarRestController {

    private CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    List<CarDto> findAllCars() {
        log.info("find all cars");

        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    CarDto findCarById(@PathVariable("id") Long carId) {
        log.info("find car by Id [{}]", carId);
        return carService.findCarById(carId);
    }
}