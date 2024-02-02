package homework11.Task2;

public class Task2CheckNumber {
    public boolean isSimple(int checkNumber) {
        for (int i = 2; i < checkNumber; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}
