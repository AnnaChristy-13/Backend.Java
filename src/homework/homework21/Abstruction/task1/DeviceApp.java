package homework21.Abstruction.task1;

import java.sql.SQLOutput;

public class DeviceApp {
    public static void main(String[] args) {
        InputDevice mouse = new Mouse();
        InputDevice keyboard = new Keyboard();

        mouse.connect();
        mouse.disconnect();

        System.out.println("=============");

        keyboard.connect();
        keyboard.disconnect();
    }
}
