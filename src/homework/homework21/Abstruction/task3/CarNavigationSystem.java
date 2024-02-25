package homework21.Abstruction.task3;

public class CarNavigationSystem extends NavigationSystem{

    @Override
    public void startNavigation(){
        System.out.println("Car navigation is started");
    }

    @Override
    public void setRout() {
        System.out.println("The shortest Rout is set");

    }

    @Override
    public void stopNavigation() {
        System.out.println("Car navigation is stopped");
    }
}
