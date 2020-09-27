package pl.sda.hellospring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.hellospring.converter.CarConverter;
import pl.sda.hellospring.domain.Car;
import pl.sda.hellospring.domain.CarRepository;
import pl.sda.hellospring.dto.CarDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CarService {

    private final CarRepository carRepository;
    private final CarConverter carConverter;

    //@Autowired nie jest wymagane jak jest jeden konstruktor bo spring to robi automatycznie
    public CarService(CarRepository carRepository, CarConverter carConverter) {
        this.carRepository = carRepository;
        this.carConverter = carConverter;
    }

    public List<CarDto> getAllCars() {
        List<CarDto> result = new ArrayList<CarDto>();

        var dataFromRepo = new ArrayList<Car>();
        carRepository.findAll()
                .forEach(car -> dataFromRepo.add(car));

        result = dataFromRepo.stream()
                .map(car -> carConverter.fromEntityToDto(car))
                .collect(Collectors.toList());

        log.debug("all cars: {}", result);
        return result;
    }

    public CarDto findCarById(Long carId) {


        var result = carRepository.findById(carId)
                .map(car -> carConverter.fromEntityToDto(car))
                .orElse(CarDto.builder().build());

        log.info("object after conversion: [{}]", result);
        return result;
    }
}