package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarsRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Cars car;

        car = new Cars("2019", "honda", "civic");
        repository.save(car);

        car = new Cars("2017", "chevy", "cruze");
        repository.save(car);

        car = new Cars("2016", "audi", "RS7");
        repository.save(car);

    }
}
