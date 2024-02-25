package homework21.Abstruction.task1;

public class Keyboard extends InputDevice{

    @Override
    public void connect(){
        System.out.println("Keyboard is connected");
    }

    @Override
    public void disconnect(){
        System.out.println("Keyboard is disconnected");
    }
}
