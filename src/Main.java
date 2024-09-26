import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();
        library.displayBook();
        Menu menu = new Menu();
        menu.runMenu();
    }
}