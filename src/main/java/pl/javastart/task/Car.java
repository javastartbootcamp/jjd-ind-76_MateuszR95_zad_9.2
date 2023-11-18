package pl.javastart.task;

public class Car extends Vehicle {

    private static final double INCREASE_IN_FUEL_CONSUMPTION = 0.08;
    private static final double DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION = 100;
    private boolean airConditioningOn;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airConditioningOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditioningOn = airConditioningOn;
    }

    public boolean isAirConditioningOn() {
        return airConditioningOn;
    }

    public void setAirConditioningOn(boolean airConditioningOn) {
        this.airConditioningOn = airConditioningOn;
    }

    public double calculateAverageConsuption() {
        if (isAirConditioningOn()) {
            return getAverageFuelConsumption() + INCREASE_IN_FUEL_CONSUMPTION;
        }
        return getAverageFuelConsumption();
    }

    public double calculateRange() {
        return getTankCapacity() * DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION / calculateAverageConsuption();
    }

    @Override
    public String printInfo() {
        return "Nazwa pojazdu: " + getName() + ", pojemność baku: " + getTankCapacity()
                + "l, średnie spalanie na 100km: " + calculateAverageConsuption() + ", zasięg pojazdu: "
                + String.format("%.2f", calculateRange()) + "km";
    }
}
