package com.test.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class CarController {

    private final CarRepository repository;

    CarController(CarRepository repository){
        this.repository = repository;
    }

    @PostMapping("/car")
    Car newCar(@RequestBody Car newEmployee) {
        return repository.save(newEmployee);
    }

    @PostMapping("/listcars")
    List<CarResult> listBestCar(@RequestBody CalculateBase base){
        List<Car> cars = repository.findAll();
        List<CarResult> result = new ArrayList<>();
        cars.forEach(x -> {
            CarResult car = new CarResult();
            Double totalCity = base.getTotalKMCity()/ Double.parseDouble(x.getAvgCity()) ;
            Double totalHighway = base.getTotalKMHighway() / Double.parseDouble(x.getAvgHighway()) ;

            car.setName(x.getName());
            car.setDateModel(x.getDateModel());
            car.setModel(x.getModel());
            car.setProducer(x.getProducer());
            DecimalFormat formatPrice = new DecimalFormat("#.##");
            DecimalFormat formatLiters = new DecimalFormat("#.###");

            car.setTotalLitersSpent(Double.valueOf(formatPrice.format(totalCity + totalHighway)));

            car.setTotalSpentReal(Double.valueOf(formatLiters.format((totalCity + totalHighway) * base.getPriceOil())));
            result.add(car);
        });


        Collections.sort(result);

        return result;
    }



}
