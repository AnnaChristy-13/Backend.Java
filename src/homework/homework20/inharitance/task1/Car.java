package homework20.inharitance.task1;

public class Car extends Vehicle{
    private int numbersOfDoors;

    public Car(String model, int year, int numbersOfDoors) {
        super(model, year);
        this.numbersOfDoors = numbersOfDoors;
    }

    public void honkTheHorn (){
        System.out.println("Watch out!");
    }

}

