package Project2;

import java.util.Comparator;

public class CarsCorparatorByYear implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getCarYear() - car2.getCarYear();

    }
}
