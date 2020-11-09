package carsmanager;

import java.util.ArrayList;
import java.util.List;

public abstract class Car implements Serviceable {
    String model;
    int price;
    int weight;
    Color color;
    private double distance = 0;
    private double distanceOnService = 0;

    public Car(String model, int price, int weight, Color color) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public abstract boolean isNeedService();

    public void addDistance(int distance) {
        this.distance += distance;
        this.distanceOnService += distance;
    }

    public void addDistance(double distance) {
        this.distance += distance;
        this.distanceOnService += distance;
    }

    public double getDistance() {
        return distance;
    }

    public double getDistanceOnService() {
        return distanceOnService;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                weight == car.weight &&
                distance == car.distance &&
                distanceOnService == car.distanceOnService &&
                model.equals(car.model) &&
                color == car.color;
    }

}
