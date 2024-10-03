public class AdminMenu {
    int choice;
    Library library = new Library();
    public AdminMenu(){

    }
    public void displayMenu(){
        System.out.println("---------------------");
        System.out.println("1. Visa alla böcker");
        System.out.println("2. Visa alla tillgängliga böcker");
        System.out.println("3. Låna en bok");
        System.out.println("4. Visa lånade böcker");
        System.out.println("5. Ta bort bok");
        System.out.println("6. Avsluta");
        System.out.println("---------------------");

    }
    public int getChoice(){
        System.out.println("Välj alternativ");
        try{
            choice=Integer.parseInt(Main.scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Invalid input");
        }
        return choice;
    }
    public void menuChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("All Books\n");
                for(String book : library.getAllBooks())
                    System.out.println(library.getAllBooks().indexOf(book)+" "+book);
                break;
            case 2:
                System.out.println("Available Books nu");
                for(String book : library.getAvailableBooks())
                    System.out.println(library.getAvailableBooks().indexOf(book)+" "+book);
                break;
            case 3:
                System.out.println("place holder av lånadbok");
                break;
            case 4:
                // VEM SOM LÅNAT, ALLA UTLÅNINGAR
                for(String book : library.getLoanedBooks())
                    System.out.println(library.getLoanedBooks().indexOf(book)+" "+book);
                break;
            case 5:
                System.out.println("Remove book: ");
                for(String book : library.getAllBooks())
                    System.out.println(library.getAllBooks().indexOf(book)+" "+book);

                library.removeAllBooks();
                break;
            case 6:
                System.exit(0);

            default:
                System.out.println("Fel alternativ");
        }

    }
    public void runMenu(){
        library.addBook();
        while(true){

            displayMenu();
            choice=getChoice();
            menuChoice(choice);
        }
    }
}
