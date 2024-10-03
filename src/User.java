public class User {
    private String userName;
    private int userId;
    private final int userValue;

    public User(String userName, int id, int userValue) {
        this.userName = userName;
        this.userId = id;
        this.userValue = userValue;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserValue() {
        return userValue;
    }

    public String getUserName() {
        return userName;
    }
}
