package homework21.Abstruction.task3;

public class MarineNavigation extends NavigationSystem{

    @Override
    public void startNavigation() {
        System.out.println("Marine navigation is started");
    }

    @Override
    public void setRout() {
        System.out.println("The shortest rout is set");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Marine navigation is stopped");
    }
}
