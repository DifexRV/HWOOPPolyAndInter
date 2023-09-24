package org.example.service;

import org.example.model.Bicycle;
import org.example.model.Car;
import org.example.model.Truck;
import org.example.model.Vehicle;

public class ServiceStation implements ServiceStationVehicle {

    @Override
    public void check(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 1; i <= car.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
        } else if (vehicle instanceof Truck truck) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
            this.checkTrailer();
        } else if (vehicle instanceof Bicycle bicycle) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
