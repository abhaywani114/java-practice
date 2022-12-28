class oop_1 {
    public static void main(String argv[]) {
        box box1 = new box(2, 3, 2);

        System.out.printf("The volume of the box is: %f\n", box1.volume());
    }
}

class box {
    double height;
    double width;
    double depth;
    box(double a, double b, double c) {
        height = a;
        width = b;
        depth = c;

    }

    double volume() {
        return height * width * depth;
    }
}


