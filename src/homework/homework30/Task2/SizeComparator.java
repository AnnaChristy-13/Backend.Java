package homework30.Task2;

import java.util.Comparator;

public class SizeComparator implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {

        return suitcase1.getSize().compareTo(suitcase2.getSize());
    }
}
