package homework04;

public class Homework04Task4 {
    public static void main(String[] args) {
        double Monday = 4;
        double Tuesday = 3;
        double Wednesday = 1;
        double Thursday = 0;
        double Friday = 0;
        double Saturday = 3;
        double Sunday = 4;



        double averageT = (Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/7;

        System.out.println();
        System.out.println("Средняя температура за неделю в Любеке - " + averageT + " градуса");
    }
}
