package org.example.model;

public abstract class Vehicle implements Checkable{

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    private void welcomeMessage() {
        System.out.println("Обслуживаем " + modelName);
    }

    private void updateTyre(int wheels) {
        for (int i = 1; i <= wheels; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    public void check() {
        welcomeMessage();
        updateTyre(wheelsCount);
    }

}
