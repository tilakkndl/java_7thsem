package lab10;

public class Admin extends User {
    private String role;
    
    Admin(String name, String email, String role) {
        super(name, email);
        this.role = role;

    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: " + role);
    }
    
}
