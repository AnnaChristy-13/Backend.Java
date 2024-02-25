package homework21.Abstruction.task1;

public class Mouse extends InputDevice{

    @Override
    public void connect(){
        System.out.println("Mouse is connected");
    }

    @Override
    public void disconnect(){
        System.out.println("Mouse is disconnected");
    }

}
