package Shapes;
public class Box {
    double height, width, breadth;
    void volume() {
        double vol = height * width * breadth;
        System.out.println("The volume of the box is: " +  vol);
    }    
}
