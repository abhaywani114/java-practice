abstract class Animal {
    String name;
    String sound;
    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
        System.out.println("I am constructor");
    }
    abstract void walk();
    void sound() {
        System.out.println(this.name + " sounds like: " + this.sound);
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog", "Bark");
    }
    void walk() {
        System.out.println(name + " walks using four limbs");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Animal an1 = new Dog();
        an1.sound();
        an1.walk();
    }
}
