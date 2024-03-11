package Project2;

import java.util.Objects;
//Создать класс Car с информацией о марке, модели, годе выпуска, цене и рейтинге автомобиля.
public class Car {

    private String carBrand;

    private String carModel;

    private int carYear;

    private double price;

    private double rating;

    public Car(String carBrand, String carModel, int carYear, double price, double rating) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.price = price;
        this.rating = rating;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carYear == car.carYear && Double.compare(price, car.price) == 0 && Double.compare(rating, car.rating) == 0 && Objects.equals(carBrand, car.carBrand) && Objects.equals(carModel, car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, carYear, price, rating);
    }


//    @Override
//    public int compareTo(Car other) {
//    return Double.compare(this.rating, other.rating);
//    }


    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                ", price=" + price +
                ", rate=" + rating +
                '}';
    }
}
