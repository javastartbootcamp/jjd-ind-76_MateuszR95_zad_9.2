package pl.javastart.task;

public class Truck extends Car {

    private double loadWeight;
    private static final double INCREASE_IN_CONSUMPTION_WITH_AIR_COND_ON = 1.6;
    private static final double DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION = 100;
    private static final double INCREASE_IN_CONSUMPTION_WITH_LOAD = 0.5;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean airConditioningOn, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, airConditioningOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateActualConsuption() {
        double consumptionIncreaseWithLoad = calculateIncreaseOfConsumption(loadWeight);
        if (isAirConditioningOn()) {
            return averageFuelConsumption + INCREASE_IN_CONSUMPTION_WITH_AIR_COND_ON
                    + consumptionIncreaseWithLoad;
        } else {
            return averageFuelConsumption + consumptionIncreaseWithLoad;
        }
    }

    @Override
    public double calculateRange() {
        return tankCapacity * DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION / calculateActualConsuption();
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", przewożony ładunek: " + loadWeight + "kg";
    }

    private double calculateIncreaseOfConsumption(double load) {
        return (INCREASE_IN_CONSUMPTION_WITH_LOAD * load) / DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION;
    }
}
