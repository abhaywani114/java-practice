class StringRegionMatchDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello Mr Abrar Wani");
        String s2 = "Abrar";
        boolean isMatch = s1.regionMatches(9, s2, 0, 5);
        System.out.println("is region match: " + isMatch);


        String s3 = "My name is Abrar Ajaz Wani. My home is in Sogam";
        System.out.println("indexOf(my): " + s3.indexOf("My"));
        System.out.println("lastIndexOf(my): " + s3.lastIndexOf("My"));

        System.out.println("is region match: " + s1.regionMatches(s1.lastIndexOf("Abrar"), s2, 0, s2.length()));
        System.out.println("lastIndexOf(xyx): " + s3.lastIndexOf("xyx"));
    }
    
}