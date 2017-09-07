package com.moondeuk;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Stateless
public class CarService {

    public List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.addAll(Arrays.asList(new Car("A00001", "m01", "blue", "t01", "2017"),
                new Car("A00002", "m02", "black", "t01", "2017"),
                new Car("A00003", "m01", "white", "t01", "2017"),
                new Car("A00004", "m02", "red", "t01", "2017")));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void createCar(Car car) {
        cars.add(car);
    }
}
