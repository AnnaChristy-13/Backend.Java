package lesson26;

import java.util.Objects;

public class TV {

    String producer;
    int size;

    public TV(String producer, int size) {
        this.producer = producer;
        this.size = size;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "producer='" + producer + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return size == tv.size && Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, size);
    }
}
