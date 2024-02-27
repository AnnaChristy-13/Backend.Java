package homework30.Task1;

import java.util.Set;
import java.util.TreeSet;

public class FlatAreaApp {
    public static void main(String[] args) {
        Set<Flat> flat = new TreeSet<>();

        flat.add(new Flat(3,78.8));
        flat.add(new Flat(1,52.7));
        flat.add(new Flat(7,222.2));

        System.out.println(flat);

    }
}
