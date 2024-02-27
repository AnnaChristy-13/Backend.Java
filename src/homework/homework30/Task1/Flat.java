package homework30.Task1;

import java.util.Objects;

public class Flat implements Comparable<Flat> {

    private int bedroom;

    private double area;

    public Flat(int bedroom, double area) {
        this.bedroom = bedroom;
        this.area = area;
    }

    public int getBedroom() {
        return bedroom;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "bedroom=" + bedroom +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Flat o) {
        if (this.bedroom != o.getBedroom()) {
            return Integer.compare(this.bedroom, o.bedroom);
        } else {
            return Double.compare(this.area, o.area);

    }
}
}
