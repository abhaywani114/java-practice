class Person {
    String name;
    String address;
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    } 
}

class User extends Person {
    String email;
    User(String name, String address, String email) {
        super(name, address);
        this.email = email;
    }
    void print() {
        System.out.println("Name: "+name);
        System.out.println("Address: "+ address);
        System.out.println("Email: "+ email);
    }
}

class Citizen extends User {
    String SSN;
    Citizen(String name, String address, String email, String SSN) {
        super(name, address, email);
        this.SSN = SSN;
    }

    void print() {
        System.out.println("Name: "+name);
        System.out.println("Address: "+ address);
        System.out.println("Email: "+ email);
        System.out.println("SSN: "+ SSN);
    }
}
class MultilevelInheritance {
    public static void main(String[] args) {
        Citizen c1 = new Citizen("Abrar", "Sogam Lolab", "abhaywani114@gmail.com", "SG1-001");
        c1.print();        
        
        User c2 = new Citizen("Mohsin", "Sogam Lolab", "mohsin@gmail.com", "SG1-002");
        c2.print();
    }    
}
