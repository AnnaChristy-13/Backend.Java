package Project2;

import java.util.*;

//Создать класс CarDealer, который использует HashMap для хранения автомобилей, где ключом является
//уникальный идентификатор автомобиля (например, VIN-номер), а значением - объект Car.
//В классе CarDealer реализовать методы для добавления новых автомобилей, удаления автомобилей из списка,
//обновления информации о конкретной машине (например, цены или рейтинга), а также поиска автомобилей
//по различным критериям (марка, модель, год выпуска).
//Добавить функционал для оценки автомобилей покупателями и сортировки автомобилей по рейтингу, цене или году выпуска.
//Реализовать возможность вывода информации о всех автомобилях в наличии или автомобилях определенной марки.

public class CarDealer {

       Map<String, Car> cars = new HashMap<>();

       public void addCar(String vin, Car car) {
              if (!cars.containsKey(vin)) {
                     cars.put(vin, car);

              }
       }

       public void removeCar(String vin) {
              System.out.println("================================================");
              if (vin != null) {
                     cars.remove(vin);
                     System.out.println("The car with VIN " + vin + " is sold");
              } else {
                     System.out.println("A Car with this VIN" + vin + "was not found in car showroom");
              }
       }

       public void updateCarByPriceUndRating(String vin, double anotherPrice, double anotherRating) {
              Car car = cars.get(vin);

              if (car != null) {
                     car.setPrice(anotherPrice);
                     car.setRating(anotherRating);
              }
              System.out.println("================================================");
              System.out.println("The car with VIN" + vin + " has an updated price " + anotherPrice + " EUR and an updated rating " + anotherRating);

       }

       public void rateCars(String vin, double anotherRating) {
              Car car = cars.get(vin);
              if (car != null) {
                     car.setRating(anotherRating);

              }
              System.out.println("================================================");
              System.out.println("Your rating to a car with VIN " + vin + " is " + anotherRating);
       }

//       /


       public void findCarByBrand(String anotherCarBrand) {
              System.out.println("================================================");
              System.out.println("Cars with brand - " + anotherCarBrand + ":");
              boolean foundCar = true;
              for (Car car : cars.values()) {
                     if (car.getCarBrand().equals(anotherCarBrand)) {
                            System.out.println("Cars of this brand " + anotherCarBrand + " and model " + car.getCarModel() + " is in the car showroom.");
                            foundCar = true;
                     }
              }
              if (!foundCar) {
                     System.out.println("Cars of this brand " + anotherCarBrand + " were not found.");
              }
       }

       public void findCarByModel(String anotherCarModel) {
              System.out.println("================================================");
              System.out.println("Car/s with model - " + anotherCarModel + ":");
              boolean foundCar = true;
              for (Car car : cars.values()) {
                     if (car.getCarModel().equals(anotherCarModel)) {
                            System.out.println("Car/s of this model " + anotherCarModel + " and brand " + car.getCarBrand() + " is in the car showroom.");
                            foundCar = true;
                     }
              }
              if (!foundCar) {
                     System.out.println("Cars of this model " + anotherCarModel + " were not found.");
              }
       }

       public void findCarByYear(int anotherCarYear) {
              System.out.println("================================================");
              System.out.println("Car/s with model - " + anotherCarYear + ":");
              boolean foundCar = true;
              for (Car car : cars.values()) {
                     if (car.getCarYear() == (anotherCarYear)) {
                            System.out.println("Car/s of this year " + anotherCarYear + " and brand " + car.getCarBrand() + " is in the car showroom.");
                            foundCar = true;
                     }
              }
              if (!foundCar) {
                     System.out.println("Cars of this year " + anotherCarYear + " were not found.");
              }
       }


       public void sortedCarsByRating() {
              System.out.println("================================================");
              System.out.println("All cars sorted by rating:");
              List<Car> sortedCars = new ArrayList<>(cars.values());
              Comparator<Car> carsComparator = new CarsComparatorByRating();
              Collections.sort(sortedCars, carsComparator);
              for (Car car : sortedCars) {
                     System.out.println(car.getCarBrand() + " " + car.getCarModel() + ", Rating: " + car.getRating());
              }
       }

       public void sortedCarsByPrice() {
              System.out.println("================================================");
              System.out.println("All cars sorted by price:");
              List<Car> sortedCars = new ArrayList<>(cars.values());
              Comparator<Car> carsComparator = new CarsComparatorByPrice();
              Collections.sort(sortedCars, carsComparator);
              for (Car car : sortedCars) {
                     System.out.println(car.getCarBrand() + " " + car.getCarModel() + ", Price: " + car.getPrice());
              }
       }

       public void sortedCarsByYear() {
              System.out.println("================================================");
              System.out.println("All cars sorted by year:");
              List<Car> sortedCars = new ArrayList<>(cars.values());
              Comparator<Car> carsComparator = new CarsCorparatorByYear();
              Collections.sort(sortedCars, carsComparator);
              for (Car car : sortedCars) {
                     System.out.println(car.getCarBrand() + " " + car.getCarModel() + ", Year: " + car.getCarYear());
              }
       }

       public void displayAllCars() {
              System.out.println("================================================");
              System.out.println("List of all cars presented in the car showroom:");
              for (Car car : cars.values()) {
              System.out.println(car);
              }


       }

       public void displayCarByBrand(String anotherCarBrand) {
              System.out.println("================================================");
              System.out.println("All car of " + anotherCarBrand + " brand in the car showroom:");
              for (Car car : cars.values()) {
                     if (car.getCarBrand().equals(anotherCarBrand)) {
                            System.out.println("Car model: " + car.getCarModel() + " ,car year: " + car.getCarYear() + " ,price: " + car.getPrice() + ",rating of the car: " + car.getRating());
                     }
              }
       }

}
