package homework21.Abstruction.task3;
//Создайте абстрактный класс NavigationSystem с абстрактными методами для старта навигации
//startNavigation и завершения навигации stopNavigation.
//Этот класс может также включать общие поля и методы, применимые ко всем системам навигации.
//Наследуйте от него классы CarNavigationSystem и MarineNavigationSystem,
//реализуя абстрактные методы для конкретных типов навигации.

public abstract class NavigationSystem {

     double currentLatitude;
     double currentLongitude;


    public abstract void startNavigation();
    public abstract void setRout();
    public abstract void stopNavigation();

    public void displayCoordinates() {
    System.out.println("Current coordinates: Lat " + currentLatitude + ", Long " + currentLongitude);



    }


}
