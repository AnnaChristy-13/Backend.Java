package homework20.inharitance.task1;

public class Bike extends Vehicle {

    private String typeOfBike;

    public Bike(String model, int year, String typeOfBike) {
        super(model, year);
        this.typeOfBike = typeOfBike;
    }

    public void speedUp (){
        System.out.println("Yohoo");
    }
}
