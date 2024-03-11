package Project2;

import java.util.Comparator;

public class CarsComparatorByRating implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getRating(),car2.getRating());
    }
}

