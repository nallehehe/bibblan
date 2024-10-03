import java.util.ArrayList;

public class Library {
    int loanChoice = 0;
    int removeChoice;
    private ArrayList<String> allBooks = new ArrayList<>();

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

    public int getRemoveChoice() {
        System.out.println("Välj alternativ");
        try{
            removeChoice=Integer.parseInt(Main.scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Invalid input");
        }
        return removeChoice;
    }

    public ArrayList<String> getAllBooks() {
        return allBooks;
    }

    private ArrayList<String> availableBooks = allBooks;
    private ArrayList<String> loanedBooks = new ArrayList<>();

    public ArrayList<String> getLoanedBooks() {
        return loanedBooks;
    }

    public void addBook(){
        //EJ INDEX POSITION
        allBooks.add("The Stonekeeper");
        allBooks.add("The Stonekeeper's Curse");
        allBooks.add("Amulet: Book Three: The Cloud Searchers");
        allBooks.add("The last council");
        allBooks.add("Prince of the elves");
        allBooks.add("Escape from Lucien");
        allBooks.add("Firelight");
        allBooks.add("Supernova");
        allBooks.add("Waverider: A Graphic Novel");
        allBooks.add("Amulet: Collectors Edition\n");
    }
    public void loanBook(int loanChoice){
        if (loanChoice > 0) {
            loanedBooks.add(availableBooks.get(loanChoice));
            availableBooks.remove(loanChoice);
        }
    }

    public void runLoanedBook() {
        loanChoice=getLoanChoice();
        loanBook(loanChoice);

    }

    public void removeAllBooks() {
        removeChoice = getRemoveChoice();
        allBooks.remove(removeChoice);
    }
}

