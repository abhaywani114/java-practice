class abstractClass {
	public static void main(String argv[]) {
		Cat c1 = new Cat("Jerry");
		c1.sound();
	}
}

abstract class Animal {
	String name;
	abstract void sound();
}

class Cat extends Animal {
	String sound = "Meao";
	Cat(String cat_name) {
		name = cat_name;
	}

	void sound() {
		System.out.printf("The sound of %s is %s", name, sound);
	}
}
