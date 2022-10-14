package com.ejemplo.Vehiculos39.model.custom;

import com.ejemplo.Vehiculos39.model.Car;

import javax.persistence.Entity;

public class CountCar {
    private Long total;
    private Car car;

    public CountCar(Long total, Car car) {
        this.total = total;
        this.car = car;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
