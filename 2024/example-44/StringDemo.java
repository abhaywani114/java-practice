class StringDemo {
    public static void main(String[] args) {
        char a[] = {'a', 'b','r','a','r'};
        System.out.println("String: " + new String(a));
        System.out.println("String: " + new String(a, 2, 3));

        byte b[] = {65, 77, 48, 53};
        System.out.println("String: " + new String(b));
        System.out.println("String: " + new String(b, 0, 2));


        System.out.println("Length of string a[]: " + (new String(a)).length() );
        System.out.println("Length of string b[]: " + (new String(b)).length() );
        
        
    }
}