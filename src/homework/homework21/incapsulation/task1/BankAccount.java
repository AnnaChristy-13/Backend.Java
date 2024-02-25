package homework21.incapsulation.task1;
//Банковский счет
//Создайте класс `BankAccount`, который инкапсулирует баланс счета. Баланс не должен быть доступен
//для прямого изменения извне, а изменяться только с помощью методов `deposit` (для внесения средств) и `withdraw` (для снятия средств).

public class BankAccount {

    private double balance;

    public BankAccount(double currentBalance) {
        this.balance = currentBalance;
    }



    public void deposit (double amount) {

        if (amount>0){
            balance+=amount;
        }
    }

    public void withDraw (double amount) {

         if (amount > 0 && amount <= balance){
             balance-=amount;
         }
    }

    public double getBalance() {
        return balance;
    }
}



