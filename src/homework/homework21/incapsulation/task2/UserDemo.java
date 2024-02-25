package homework21.incapsulation.task2;

public class UserDemo {
    public static void main(String[] args) {

        User user = new User("Elisabeth456","Abcdef","email000@mail.com");

        user.changeLogin("Elisabeth789");

        user.changePassword("Abcdef","Abcdefg");

        user.changeEmail("emai111111@mail.com");
    }




}
