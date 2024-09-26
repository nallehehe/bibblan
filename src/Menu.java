public class Menu {
    int choice;
    Library library = new Library();
    public Menu(){

    }
    public void displayMenu(){
        System.out.println("1. Visa alla böcker");
        System.out.println("2. Visa alla tillgängliga böcker");
        System.out.println("3. Visa information om en bok");
        System.out.println("4. Avsluta");

    }
    public int getChoice(){
        System.out.println("Välj alternativ");
        try{
            choice=Integer.parseInt(Main.scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Invalid input");
        }
        return choice;
    }public void menuChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("Available Books\n");
                library.displayBook();
                for(String book : library.books)
                    System.out.println(book);
                break;
            case 2:
                System.out.println("Alternativ 2");
                break;
            case 3:
                System.out.println("Alternativ 3");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Fel alternativ");
        }

    }
    public void runMenu(){
        while(true){
            displayMenu();
            choice=getChoice();
            menuChoice(choice);
        }
    }
}
