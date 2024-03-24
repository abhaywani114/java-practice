class Person {
    private String name;
    private String address;
    private String email;

    Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email  = email;
    }

    Person(String name) {
        this.name = name;
        address = email = "NA";
    }
    
    String name() {
        return name;
    }

    String address() {
        return address;
    }

    String email() {
        return email;
    }
}

class Student extends Person {
    private String school;
    Student(String name, String address, String email, String school) {
        super( name, address,  email);
        this.school = school;
    }
    Student(String name) {
        super(name);
        school = "NA";
    }
    String school() {
        return school;
    }
}

class SuperDemo {
    public static void main(String[] args) {
        Student std1 = new Student("Abrar", "Sogam Lolab", "abhaywani114@gmail.com", "Osmanli Dergahi");
        System.out.printf("Name: %s\nAddress: %s\nEmail: %s\nSchool: %s\n\n", std1.name(), std1.address(), std1.email(), std1.school());
        
        Student std2 = new Student("Mohsin");
        System.out.printf("Name: %s\nAddress: %s\nEmail: %s\nSchool: %s\n\n", std2.name(), std2.address(), std2.email(), std2.school());
        
    }    
}
