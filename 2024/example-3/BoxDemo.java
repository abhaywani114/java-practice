class Box {
    double height, breadth, width;
    // Method-1 of initilizing 
    // void setDim(double h, double b, double w) {
    //     height  = h;
    //     breadth = b;
    //     width = h;
    // }
    Box(double height, double breadth, double width) {
        this.height = height;
        this.breadth = breadth;
        this.width = width;
    }
    double vol() {
        return height * breadth * width;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10,4,5); 
        // b1.setDim(10, 2, 5);
        System.out.println("The vol of b1 is: " + b1.vol());  
    }    
}
