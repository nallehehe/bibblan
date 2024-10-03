import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User("Adam", 1, 1);
        User user2 = new User("Alex", 2, 2);
        User user3 = new User("Alex", 2, 2);


        UserMenu userMenu = new UserMenu();
        AdminMenu adminMenu = new AdminMenu();

        if (user1.getUserValue() == 2) {
            userMenu.runMenu();
        }
        adminMenu.runMenu();
    }
}