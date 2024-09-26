import java.util.ArrayList;

public class Library {
    int loanChoice = 0;
    boolean isTrue = false;
    private ArrayList<String>books = new ArrayList<>();

    public ArrayList<String> getAvailableBooks() {
        return availableBooks;
    }
    public int getLoanChoice(){
        System.out.println("Välj alternativ");
        try{
            loanChoice=Integer.parseInt(Main.scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Invalid input");
        }
        return loanChoice;
    }

    public ArrayList<String> getBooks() {
        return books;
    }
    private ArrayList<String>availableBooks = books;
    public ArrayList<String>loanedBooks = new ArrayList<>();

    public ArrayList<String> getLoanedBooks() {
        return loanedBooks;
    }

    public void addBook(){
        books.add("1.The Stonekeeper");
        books.add("2.The Stonekeeper's Curse");
        books.add("3.Amulet: Book Three: The Cloud Searchers");
        books.add("4.The last council");
        books.add("5.Prince of the elves");
        books.add("6.Escape from Lucien");
        books.add("7.Firelight");
        books.add("8.Supernova");
        books.add("9.Waverider: A Graphic Novel");
        books.add("10.Amulet: Collectors Edition\n");
    }
    public void loanBook(int loanChoice){
        while(!isTrue){
            if(loanChoice < 0){
                loanedBooks.add(availableBooks.get(loanChoice-1));
                availableBooks.remove(loanChoice-1);

            }
        }
    }

    public void displayBook() {
        for(String book : availableBooks)
            System.out.println(book);
    }

    public void runLoanedBook() {
        displayBook();
        loanChoice=getLoanChoice();
        loanBook(loanChoice);

    }
}

