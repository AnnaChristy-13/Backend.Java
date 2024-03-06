package lesson36.task1;

public class FlowerShop {
    public static void main(String[] args) {

        Bouquet<String,Integer> bouquet1 = new Bouquet<>("Tulip",25);
        System.out.println(bouquet1.getFlower() + " " + bouquet1.getAmount());

        Bouquet<Integer,String> bouquet2 = new Bouquet<>(45,"Roses");
        System.out.println(bouquet2.getAmount()+ " " + bouquet2.getFlower());

    }
}
