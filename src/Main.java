import javax.swing.*;
import Program.Menu;

public class Main {

    public static int width = 500;
    public static int height = 500;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new Menu(width, height);
        });
    }
}
