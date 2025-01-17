/**
 *
 * @author Sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.loadProjects();

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }

}
