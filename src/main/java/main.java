
import controller.UserManager;
import menu.Menu;


public class main {
    public static void main(String[] args) {
        String title = "USER MANAGEMENT SYSTEM ";
        String[] s = new String[]{"Create a new account", "Login system","Exit"};
        Menu<String> menu = new UserManager(title, s);
        menu.run();

    }
}
