package pl.javastart.task;

public class ConsumptionWithLoadCalculator {

    private static final double AVERAGE_FUEL_CONSUMPTION_INCREASE = 0.5;
    private static final double DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION = 100;

    public static double calculateIncreaseOfConsumption(double load) {
        return (AVERAGE_FUEL_CONSUMPTION_INCREASE * load) / DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION;
    }
}
