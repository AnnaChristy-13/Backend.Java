package consultations.consultation13.ui;

public class ExitMenu implements MenuCommand{
    @Override
    public void executeCommand() {
        System.out.println("Bye-bye!");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit";
    }

    @Override
    public boolean shouldExit() {
        return true;
    }
}
