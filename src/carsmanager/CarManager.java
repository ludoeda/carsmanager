package carsmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    public static void main(String[] args) {
        Car car1 = new Bus("edum", 500, 1000, Color.ORANGE);
        Car car2 = new PassengersCar("dumdum", 700, 800, Color.BLACK);
        Car car3 = new PassengersCar("dumdum", 700, 800, Color.BLACK);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        car1.addDistance(15000);
        car2.addDistance(15000);
        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.isNeedService());
        }
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));
    }
}
