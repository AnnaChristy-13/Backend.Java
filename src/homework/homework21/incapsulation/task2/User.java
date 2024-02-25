package homework21.incapsulation.task2;

//Управление учетными записями пользователей Создайте класс `User`, который инкапсулирует данные пользователя:
//логин, пароль и email. Обеспечьте безопасное изменение и доступ к этим полям через геттеры и сеттеры.
//Пароль должен изменяться только если старый пароль введен верно и новый пароль соответствует
//определенным требованиям безопасности.


public class User {

    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void changeLogin(String newLogin){
        this.login = newLogin;
    }

    public void changePassword (String oldPassword, String newPassword) {
        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
        } else {
            System.out.println("Your old password is not correct. Please, try again ");
        }
    }

    public void changeEmail (String newEmail){
        this.email = newEmail;
    }
}
