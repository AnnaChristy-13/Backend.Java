package lesson26;

import java.util.ArrayList;

/*
    создать класс TV
    - производитель
    - размер

    создать коллекцию
    и внести туда 3 элемента
    распечатать
    и удалить один - первый из всех у кого совпадет производитель

     */

public class TvCollection {

    public static void main(String[] args) {


        ArrayList<TV> tvs = new ArrayList<>();

        tvs.add(new TV("Samsung", 32));
        tvs.add(new TV("LG", 42));
        tvs.add(new TV("Sony", 40));

        System.out.println(tvs);

        String soldOutProducer = "LG";
        String manufacturerForDelete = "Samsung";
        TV tvForRemove = findFirstTvByManufacturer(tvs,soldOutProducer);

        if (tvForRemove != null) {
            tvs.remove(tvForRemove);
            System.out.println("Телевизоры марки LG распроданы");
            System.out.println("Оставшиеся телевизоры других производителей:");
            System.out.println(tvs);

        } else {
            System.out.println("Такого производителя не найдено!");
        }


    }

    private static void printTvList(ArrayList<TV> tvList){
        for (int i = 0; i < tvList.size(); i++) {
            System.out.println(tvList.get(i));
        }
    }

    private static TV findFirstTvByManufacturer(ArrayList<TV> tvList, String producer){
        for (int i = 0; i < tvList.size(); i++) {
            TV currentTvFromCollection = tvList.get(i);
            if (currentTvFromCollection.getProducer().equals(producer)) {
                return currentTvFromCollection;
            }
        }
        return null;
    }
}



