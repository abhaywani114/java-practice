class Main {
    public static void main(String[] args) {
        int age = 23;
        String name = "Abrar Ajaz";
        System.out.println(String.format("My name is %s, and my age is %d", name, age).toLowerCase());

        String st1 = "abc", st2 = new String("abc"), st3 = "ABC";
        System.out.println(st1.equals(st2));
        System.out.println(String.format("is %s==%s ? %b", st1, st3, st1.equals(st3)));
        System.out.println(String.format("is %s==%s ? %b (ignore case)", st1, st3, st1.equalsIgnoreCase(st3)));
    }
}
