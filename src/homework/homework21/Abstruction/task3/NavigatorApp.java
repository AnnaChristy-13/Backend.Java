package homework21.Abstruction.task3;

public class NavigatorApp {
    public static void main(String[] args) {
        NavigationSystem carNavi = new CarNavigationSystem();
        NavigationSystem marineNavi = new MarineNavigation();

        System.out.println("===================");
        System.out.println("Car navigation system");
        System.out.println("===================");

        carNavi.currentLatitude = 52.13;
        carNavi.currentLongitude = 21.02;
        carNavi.startNavigation();
        carNavi.setRout();
        carNavi.stopNavigation();

        carNavi.displayCoordinates();

        System.out.println("===================");
        System.out.println("Marine navigation system");
        System.out.println("===================");

        marineNavi.currentLatitude = 54.21;
        marineNavi.currentLongitude = 18.38;
        marineNavi.startNavigation();
        marineNavi.setRout();
        marineNavi.stopNavigation();

        carNavi.displayCoordinates();
    }
}
