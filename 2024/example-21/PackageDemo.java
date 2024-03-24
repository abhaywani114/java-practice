import StudentPkg.Student;

class PackageDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Abrar Ajaz Wani");
        s1.print();

        Teacher t1 = new Teacher();
        t1.print();
    }    
}
