package homework30.Task2;
//Чемодан - 3 параметра материал (пластик или ткань), размер - M, L, XL и цвет.
//Создать две коллекции - TreeSet и LinkedList и отсортировать по трем параметрам
//- размеру и материалу и цвету
public class Suitcase {

    String material;
    String size;
    String color;

    public Suitcase(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
