class main {
    public static void main(String[] argv) {
        int i = 0b0001;

        System.out.println("Before shift i="+i);
        i = i << 2;
        System.out.println("After shift i="+i);


        /*
         * Cout no of bits using bitwise operatiors
        */

        int y = 0b11001;
        int no_of_1bits = 0;
        int no_of_0bits = 0;

        for ( i = y; i != 0; i >>=1 ) {
            if ((i & 1) == 1) 
                no_of_1bits++;
            else 
                no_of_0bits++;
        }

        System.out.println("\n\nFor number: " + y); 
        System.out.println("No of total bits=" + (no_of_1bits + no_of_0bits));
        System.out.println("No of 1 bits=" + no_of_1bits);
        System.out.println("No of 0 bits=" + no_of_0bits);
    }
}
