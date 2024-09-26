public class menu {
    int choice;
    public void displayMenu(){
        System.out.println("1. Visa alla böcker");
        System.out.println("2. Visa alla tillgängliga böcker");
        System.out.println("3. Visa information om en bok");

    }
    public int getChoice(){
        System.out.println("Välj alternativ");
        choice=Integer.parseInt(Main.scanner.nextLine());
        return choice;
    }
}
