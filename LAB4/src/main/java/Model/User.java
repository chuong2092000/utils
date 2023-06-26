package Model;

public class User {
    private String UserName;
    private String Password;
    private Boolean remember;

    public User() {
    }

    public User(String userName, String password, Boolean remember) {
        UserName = userName;
        Password = password;
        this.remember = remember;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Boolean getRemember() {
        return remember;
    }

    public void setRemember(Boolean remember) {
        this.remember = remember;
    }
}
