 class GenericMethodDemo {
    static <T, V extends T> boolean isIn(T needle, T[] hay) {
        for(T e : hay )
            if (e.equals(needle))
                return true;
        return false;
    }
    public static void main(String[] args) {
        Integer[] arr  ={1, 3, 4, 5, 6};
        System.out.println("Is 5 in arr: " + isIn(5, arr));   
        System.out.println("Is 10 in arr: " + isIn(10, arr));   
    }   
}