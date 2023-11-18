package pl.javastart.task;

public class Truck extends Car {

    private double loadWeight;
    private static final double INCREASE_IN_FUEL_CONSUMPTION = 1.6;
    private static final double DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION = 100;

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
    public double calculateAverageConsuption() {
        double consumptionIncreaseWithLoad = ConsumptionWithLoadCalculator.calculateIncreaseOfConsumption(loadWeight);
        if (isAirConditioningOn()) {
            return getAverageFuelConsumption() + INCREASE_IN_FUEL_CONSUMPTION
                    + consumptionIncreaseWithLoad;
        } else {
            return getAverageFuelConsumption() + consumptionIncreaseWithLoad;
        }
    }

    @Override
    public double calculateRange() {
        return getTankCapacity() * DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION / calculateAverageConsuption();
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", przewożony ładunek: " + loadWeight + "kg";
    }
}
