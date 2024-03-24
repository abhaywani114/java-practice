import AnimalInterface.AnimalInterface;
class Dog implements AnimalInterface {
    public String animalSound() {
        return "Bow";
    }
    public String animalName() {
        return "Dog";
    }
}
class InterfaceDemo  {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        System.out.println("Name: " + a1.animalName());
        System.out.println("Sound: " + a1.animalSound());
    }
}
