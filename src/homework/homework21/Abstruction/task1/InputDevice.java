package homework21.Abstruction.task1;
//Создайте абстрактный класс InputDevice, который включает абстрактные методы connect и disconnect, а также может содержать поля или неабстрактные методы, общие для всех устройств ввода.
//От этого абстрактного класса наследуйте классы Keyboard и Mouse, реализуя абстрактные методы.
abstract class InputDevice {
    public abstract void connect();
    public abstract void disconnect();


}
