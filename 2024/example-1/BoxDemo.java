class Box {
    double width;
    double depth;
    double height;
}
class BoxDemo {
    public static void main(String[] args) {   
        Box myBox = new Box();
        double vol;
        myBox.width = 10.00;
        myBox.depth = 5.00;
        myBox.height = 2.00;
        vol = myBox.width * myBox.depth * myBox.height;
        System.out.println("The volume is: " + vol);
    }
}