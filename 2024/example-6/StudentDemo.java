class Student {
  String name;
  protected int age;
  Student(String name, int age) {
    this.name = name;
    this.age  = age;
  }

  Student() {
    this.name = "undefined";
    this.age = -1;
  }

  void print() {
    System.out.println();
    System.out.println("Student Name: " + this.name);
    System.out.println("Student Age: " + this.age);
    System.out.println();
  }
}

class StudentDemo {
  public static void main(String[] argv) {
    Student s1 = new Student("MZ", 18);
    Student s2 = new Student();
    s1.print();
    s2.print();

    s2.name = "Abrar";
    s2.age = 25;
    s2.print();
  }
}