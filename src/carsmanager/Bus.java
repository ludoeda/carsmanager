package carsmanager;

public class Bus extends Car {
    public Bus(String model, int price, int weight, Color color) {
        super(model, price, weight, color);
    }

    @Override
    public boolean isNeedService() {
        return getDistanceOnService() > 50000;
    }

}
