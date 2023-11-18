package pl.javastart.task;

public class Garage {

    private Car[] cars = new Car[5];

    public Garage() {
        cars[0] = new Car("Ford", 55, 6.7, false);
        cars[1] = new Car("Opel", 45, 6.2, false);
        cars[2] = new Car("Nissan", 65, 8.6, false);
        cars[3] = new Truck("Scania", 200, 15.6, false, 400);
        cars[4] = new Truck("Star", 220, 16.7, false, 500);
    }

    public void printInfo() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].printInfo());
        }
    }

}
