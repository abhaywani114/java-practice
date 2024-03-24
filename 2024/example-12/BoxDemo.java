class Box {
    double height, width, depth;
    Box() {
        height = width = depth = -1;
    } 
    Box(double height, double width, double depth) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }
    double vol() {
        return height * width * depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight() {
        height = width = depth = weight = -1;
    }
    BoxWeight(double height, double width, double depth, double weight) {
        this.height = height;
        this.depth = depth;
        this.width = width;
        this.weight = weight;
    }
    double getWeight() {
        return weight;
    }
    double density() {
        return this.vol() * weight;
    }
}
class BoxDemo {
    public static void main(String[] args) {
        BoxWeight bw1 = new BoxWeight(10, 20, 30, 40);
        System.out.println("Volume of box: "+ bw1.vol());
        System.out.println("Weight of box: " + bw1.getWeight());
        System.out.println("Density of box: " + bw1.density());
    }    
}
