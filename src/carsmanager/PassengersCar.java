package carsmanager;

public class PassengersCar extends Car {
    public PassengersCar(String model, int price, int weight, Color color) {
        super(model, price, weight, color);
    }

    @Override
    public boolean isNeedService() {
        return getDistanceOnService() > 10000;
    }
}
