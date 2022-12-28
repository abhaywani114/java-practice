/*
 * Main driver
*/

class simpleInheritance {
	public static void main(String argv[]) {
		Rectangle r1 = new Rectangle();
		r1.height  = 10;
		r1.width = 20;
		r1.shapeName();
		r1.getArea();


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
	void getArea() {
		System.out.printf("The %s is of area: %d\n", this.getName(), height, width);
	}
}


