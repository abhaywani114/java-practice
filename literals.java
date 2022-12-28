class literals {
    public static void main(String[] argc) {
        int i = 0b1000 + 0b0001;
        int p = 192_168_1_1;
        int oc = 0b0001_0010_0100_1000;
        int oc1 = 0b1000_0100_0010_0001;

        System.out.println("I="+i);
        System.out.println("IP="+p);
        System.out.println("oc="+oc);
        System.out.println("oc1="+oc1);
    }
}
