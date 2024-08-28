package lab14;

public class Dog extends Animal {
    // private String name;
    // private String color;
    Dog(){
        super("Dog", "White");
        System.out.println("Rom dog constructor");
        System.out.println("Name: "+name+ "" + " Color: "+color);
    }
    
}
