//package homework19;
//
//import lessons06.scanner.UserInput;
//
//import java.util.Arrays;
//
//public class Task5Demo {
//    UserInput userInput = new UserInput();
//    int number = userInput.inputInteger("Enter please any number that more than 3");
//
//    public int getNumberfromUser() {
//
//        while (number <= 3) {
//            if (number <= 3) {
//                System.out.println("The number you entered is less than 3, try again");
//
//            } else {
//                System.out.println("You entered false number");
//
//            }
//
//        }
//        return number;
//    }
//
//    // Создаем метод для создания первого массива из случайных чисел и высчитываем четные числа в массиве.
//
//
//    int[] randomArray = new int[number];
//
//    public int[] createArray() {
//
//        for (int i = 0; i < number; i++) {
//            randomArray[i] = (int) (Math.random() * number) + 1;
//
//
//        }
//        return randomArray;
//
//    }
//
//    public int[] createArrayWithEvenNumbers() {
//
//        int evenCounter = 0;
//        for (int i = 0; i < number; i++) {
//            if (randomArray[i] % 2 == 0) {
//                evenCounter++;
//            }
//        }
//        int[] evenNumberArray = new int[evenCounter];
//        int indexCounter = 0;
//        for (int i = 0; i < number; i++) {
//            if (randomArray[i] % 2 == 0) {
//                evenNumberArray[indexCounter] = randomArray[i];
//                indexCounter++;
//
//            }
//
//        }
//        return evenNumberArray;
//    }
//}
//
