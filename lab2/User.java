package lab2;

public class User {
    private String UserName;
    private String Password;
    private String USERNAME="tilak";
    private String PASSWORD="tilak123";
    User() {
        this.UserName="";
        this.Password="";
    }
    public Boolean authenticate(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
        if (this.UserName.equals(this.USERNAME) && this.Password.equals(this.PASSWORD)) {
            return true;
        }
        return false;
    }
}
