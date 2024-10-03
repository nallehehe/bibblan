import java.util.ArrayList;
import java.util.List;

public class ChooseUser {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getUserName() + " added");
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user.getUserName());
        }
    }
}
