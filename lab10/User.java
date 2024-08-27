package lab10;

public class User {
    private String name;
    private String email;
 
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
