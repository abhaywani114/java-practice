/*
 * Main driver
 * multi level inheritance
 * Shape -> Rectangle -> Shipment
*/

class simpleInheritance {
	public static void main(String argv[]) {
		Shipment s1 = new Shipment(10);
		s1.height = 10;
		s1.width = 22;
		s1.shapeName();
		s1.displayArea();
		System.out.printf("The shipment cost is: %d\n", s1.calculateCost());


	}
}


class Shape {
	private String name;
	Shape(String n) {
		name = n;
	}

	void shapeName() {
		System.out.printf("The name of shape is: %s\n", name);
	}

	String getName() {
		return name;
	}
}

class Rectangle extends Shape {
	int height, width;
	Rectangle() {
		super("Rectangle");
	}
	void displayArea() {
		System.out.printf("The %s is of area: %d\n", this.getName(), height, width);
	}
	int getArea() {
		return height * width;
	}
}

class Shipment extends Rectangle {
	int cost;
	Shipment(int i) {
		cost = i;
	}
	int calculateCost() {
		return getArea() * cost;
	}
}


