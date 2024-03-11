package Project2;

public class CarShowroom {
    public static void main(String[] args) {

        CarDealer carDealer = new CarDealer();

        Car car1 = new Car("Mercedes","B200",2016,17490,4.7);
        Car car2 = new Car("BMW","X5",2019,39999,4.5);
        Car car3 = new Car("Mercedes","G 63 AMG",2016,119000,4.9);
        Car car4 = new Car("Range Rover","Sport SDV6",2015,25999,4.4);
        Car car5 = new Car("Opel","Mokka",2013,4950,4.3);


        carDealer.addCar("123645F",car1);
        carDealer.addCar("158746A",car2);
        carDealer.addCar("657309N",car3);
        carDealer.addCar("374654B",car4);
        carDealer.addCar("108464G",car5);

        carDealer.removeCar("108464G");

        carDealer.updateCarByPriceUndRating("123645F",16000,4.8);

        carDealer.findCarByBrand("Mercedes");

        carDealer.findCarByModel("X5");

        carDealer.findCarByYear(2016);

        carDealer.rateCars("374654B",4.5);

        carDealer.sortedCarsByRating();

        carDealer.sortedCarsByPrice();

        carDealer.sortedCarsByYear();

        carDealer.displayAllCars();

        carDealer.displayCarByBrand("Mercedes");



    }
}
