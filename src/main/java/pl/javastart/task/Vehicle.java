package pl.javastart.task;

public class Vehicle {

    protected String name;
    protected double tankCapacity;
    protected double averageFuelConsumption;

    public Vehicle(String name, double tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String printInfo() {
        return "Nazwa pojazdu: " + name + ", pojemność baku: " + tankCapacity
                + ", średnie spalanie na 100km: " + averageFuelConsumption + "l";
    }

}
