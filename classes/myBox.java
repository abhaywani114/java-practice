import java.util.Scanner;

class Box {
    Scanner keyboard = new Scanner(System.in);
    int height;
    int depth;
    int width;
   public void getHeight() {
        System.out.println("Enter height:");
        this.height = this.keyboard.nextInt();
    }
    public void getDepth() {
        System.out.println("Enter Depth:");
        this.depth = this.keyboard.nextInt();
    }
    public void getWidth() {
        System.out.println("Enter width:");
        this.width = this.keyboard.nextInt();
    }
    public int calVol() {
        return this.height * this.depth * this.width;
    }
}

public class myBox {
    public static void main(String argv[]) {
        Box b1 = new Box();
        b1.getHeight();
        b1.getWidth();
        b1.getDepth();
        System.out.println("The volume of box is: " + b1.calVol());
    }
}