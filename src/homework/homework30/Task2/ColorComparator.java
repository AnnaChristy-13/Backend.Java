package homework30.Task2;

import java.util.Comparator;

public class ColorComparator implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {

        return suitcase1.getColor().compareTo(suitcase2.getColor());
    }
}
