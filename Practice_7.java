abstract class Vehicle{
    protected String brand;
    protected int year;
    public void start(){
        System.out.println("Транспортное средство заведено");
    }
}

class Car extends Vehicle{
    private int numberOfDoors;
    @Override public void start(){
        System.out.println("Автомобиль " + brand + " заведён");
    }
}
class Motorcycle extends Vehicle{
    @Override public void start(){
        System.out.println("Мотоцикл " + brand + " заведён");
    }
}

public class Practice_7 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.year = 2020;
        car.start();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.brand = "Honda";
        motorcycle.year = 2019;
        motorcycle.start();
    }
}
