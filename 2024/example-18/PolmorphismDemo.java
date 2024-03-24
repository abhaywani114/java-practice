class Figure {
    double dim1, dim2;
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    void area() {
        System.err.println("Area for the figure is undefined");
    }
}

class Rectangle extends Figure {
    Rectangle(double width, double length ) {
        super(width, length);
    }
    void area() {
        System.out.println("Area of rectangle is: " + dim1 * dim2);
    }
}

class Triangle extends Figure {
    Triangle(double height, double base ) {
        super(height, base);
    }
    void area() {
        System.out.println("Area of Triangle is: " + (dim1 * dim2)/2);
    }
}

class PolmorphismDemo {
    public static void main(String[] args) {
        Figure f1 = new Figure(10, 20);
        Figure f2 = new Rectangle(12, 23);
        Figure f3 = new Triangle(10, 10);

        f1.area();
        f2.area();
        f3.area();
    }
}
