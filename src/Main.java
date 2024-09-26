import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();
        Menu menu = new Menu();
        menu.runMenu();
    }
}