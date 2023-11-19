package pl.javastart.task;

public class Garage {

    private Car[] cars = new Car[5];

    public Garage() {
        cars[0] = new Car("Ford", 55, 6.7, true);
        cars[1] = new Car("Opel", 45, 6.2, true);
        cars[2] = new Car("Nissan", 65, 8.6, true);
        cars[3] = new Truck("Scania", 200, 15.6, true, 400);
        cars[4] = new Truck("Star", 220, 16.7, true, 500);
    }

    public void printInfo() {
        for (Car car : cars) {
            System.out.println(car.printInfo());
        }
    }

}
