public class foreachArray {
    public static void main(String[] argv) {
        int[][] array_1 = {
            {12,23,34,44,45},
            {10,20,30,40},
            {91, 20, 30},
            {99, 66},
            {55}
        };
        System.out.println("Printing 2d array using foreach loop");
        for(int[] row:array_1) {
            for(int element:row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }   
    }
}
