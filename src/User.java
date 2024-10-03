public class User {
    private String userName;
    private int userId;
    private  String userValue;



    public User(String userName, int id, String userValue) {
        this.userName = userName;
        this.userId = id;
        this.userValue = userValue;
    }


    public int getUserId() {
        return userId;
    }

    public String getUserValue() {
        return userValue;
    }

    public String getUserName() {
        return userName;
    }


}
