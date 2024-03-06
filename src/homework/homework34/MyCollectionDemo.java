package homework34;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MyCollectionDemo {
    public static void main(String[] args) {

        MyCollection myCollection = new MyCollection();

        Element element1 = new Element(1,"first");
        Element element2 = new Element(2,"second");
        Element element3 = new Element(3,"third");

        myCollection.add(element1);
        myCollection.add(element2);
        myCollection.add(element3);

        myCollection.add2(1,element1);
        myCollection.add2(2,element2);
        myCollection.add2(3,element3);

        System.out.println("My collection after adding elements: ");
        System.out.println(myCollection);

        myCollection.remove(1);

        myCollection.size();


    }
}
