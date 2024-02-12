package homework12;

//Написать метод для вычисления факториала числа (произведение всех чисел от 1 до заданного)
public class Task3 {


    public static void main(String[] args) {
//      Вводим переменную int  число для которого мы хотим узнать факториал

        int number = 25;

//      Вводим переменную int и передаем ей значение 1, т.к факториал числа n — это произведение всех натуральных чисел от 1 до n включительно

        int result = 1;

//        Далее мы использовали цикл for, чтоб перемножать числа от 1 до n

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Factorial number is " + result);
    }

}




