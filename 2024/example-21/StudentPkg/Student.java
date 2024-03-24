package StudentPkg;
public class Teacher{
    public void print() {
        System.out.println("Hello teacher");
    }
}
public class Student {
    String name;
    public Student(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Student's name is: " + name);
    }   
}
