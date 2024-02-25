package homework21.inharitance.task1;

public class VehicleDemo {
    public static void main(String[] args) {

        Car car = new Car("B-class", 2018, 4);
        car.honkTheHorn();
        car.slowDown();

        Bike bike = new Bike("AGT", 2023, "CityBike");
        bike.speedUp();
        bike.slowDown();


    }
}
