package consultations.consultation13.ui;

public interface MenuCommand {
    void executeCommand();

    String getMenuName();
    boolean shouldExit();
}
