package pl.javastart.task;

public class Car extends Vehicle {

    private static final double INCREASE_IN_CONSUMPTION_WITH_AIR_COND_ON = 0.08;
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

    public double calculateActualConsuption() {
        if (isAirConditioningOn()) {
            return averageFuelConsumption + INCREASE_IN_CONSUMPTION_WITH_AIR_COND_ON;
        }
        return averageFuelConsumption;
    }

    public double calculateRange() {
        return tankCapacity * DISTANCE_FOR_AVERAGE_FUEL_CONSUMPTION / calculateActualConsuption();
    }

    @Override
    public String printInfo() {
        return "Nazwa pojazdu: " + name + ", pojemność baku: " + tankCapacity
                + "l, średnie spalanie na 100km: " + calculateActualConsuption() + "l, zasięg pojazdu: "
                + String.format("%.2f", calculateRange()) + "km";
    }
}
