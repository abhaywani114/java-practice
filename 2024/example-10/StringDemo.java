

class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("How are you?");
        String s3 = new String("Hello");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s2 at 3: " + s2.charAt(2));
        System.out.println("s3 == s1: " + s3.equals(s1));
        System.out.println("s1 == s2: " + s1.equals(s2));
    }    
}
