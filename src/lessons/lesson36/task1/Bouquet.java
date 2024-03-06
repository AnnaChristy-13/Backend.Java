package lesson36.task1;

public class Bouquet <T,U>{
    T flower;
    U amount;

    public Bouquet(T flower, U amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public T getFlower() {
        return flower;
    }

    public U getAmount() {
        return amount;
    }


}
