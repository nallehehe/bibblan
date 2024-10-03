import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        boolean isTrue = true;
        ChooseUser chooseUser = new ChooseUser();

        User user1 = new User("Adam", 1, "ADMIN");
        User user2 = new User("Alex", 2, "BASIC");
        User user3 = new User("Timmy", 3, "BASIC");
        User user4 = new User("Axel", 4, "BASIC");

        chooseUser.addUser(user2);
        chooseUser.addUser(user3);
        chooseUser.addUser(user4);


        UserMenu userMenu = new UserMenu();
        AdminMenu adminMenu = new AdminMenu();


        while (isTrue) {
            System.out.println("LOG IN");
            System.out.println("1. User login");
            System.out.println("2. Admin login");
            System.out.println("3. Exit");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Regular User");
                        chooseUser.displayUsers();
                        //Spara lånade böcker till specifik user?
                        //userMenu.runMenu();
                        break;
                    case 2:
                        System.out.println("Admin User");
                        adminMenu.runMenu();
                        break;
                    case 3:
                        System.out.println("AVSLUTAR");
                        isTrue = false;
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }


    }
}