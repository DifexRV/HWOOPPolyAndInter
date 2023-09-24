package org.example;

public class ServiceStation implements ServiceStationVehicle {

    @Override
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 1; i <= car.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
            this.checkTrailer();
        } else if (bicycle != null) {
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
