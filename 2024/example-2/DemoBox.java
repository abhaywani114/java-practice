class Box {
    double height, width, breadth;
    double volume() {
        double vol = height * width * breadth;
        return vol;
    }    
}
public class DemoBox {
    public static void main(String[] args) {
        Box B1 = new Box();
        B1.breadth = 10;
        B1.height  = 5;
        B1.width = 2;
        double vol = B1.volume();
        System.out.println("The volume of the box is: " + vol);
    }   
}
