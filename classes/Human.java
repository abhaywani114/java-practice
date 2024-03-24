import java.util.Scanner;
class Human {
    double height;
    int age;
    String name;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        Human h1 = new Human();
        
        h1.name = "Zara";
        
        System.out.println("Enter Age:");
        h1.age = keyboard.nextInt();

        System.out.println(h1.name);
        System.out.println("Is she adult? " + h1.isAdult());      
    }
    public boolean isAdult() {
        if (this.age >= 18)
            return true;
        else
            return false;
    }
}