package homework30.Task2;

import lesson30.book.Book;

import java.util.*;

public class SuitcaseShop {

    public static void main(String[] args) {

        Comparator<Suitcase> suitcaseComparator = new MaterialComparator().thenComparing(new SizeComparator().thenComparing(new ColorComparator()));

        Set<Suitcase> suitcaseSet = new TreeSet<>(suitcaseComparator);

        suitcaseSet.add(new Suitcase("Plastic","XL","Yellow"));
        suitcaseSet.add(new Suitcase("Material","M","Grey"));
        suitcaseSet.add(new Suitcase("Material","L","Black"));
        suitcaseSet.add((new Suitcase("Plastic","M","dark blue")));

        System.out.println("Sorted suitcases by TreeSet: ");
        for (Suitcase suitcase : suitcaseSet) {
            System.out.println(suitcase);
        }
            List<Suitcase> suitcaseList = new LinkedList();

        suitcaseList.add(new Suitcase("Plastic","XL","Yellow"));
        suitcaseList.add(new Suitcase("Material","M","Grey"));
        suitcaseList.add(new Suitcase("Material","L","Black"));
        suitcaseList.add((new Suitcase("Plastic","M","dark blue")));


        suitcaseList.sort(suitcaseComparator);

        System.out.println(" ");
        System.out.println("Sorted suitcases by LinkedList: ");
        for (Suitcase suitcase : suitcaseSet) {
            System.out.println(suitcase);
        }








    }
}
