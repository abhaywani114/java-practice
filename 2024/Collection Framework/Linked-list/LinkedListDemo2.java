import java.util.LinkedList;
class LinkedListDemo2 {
    public static  LinkedList<Integer> merge( LinkedList<Integer> l1,  LinkedList<Integer> l2) {
        LinkedList<Integer> result =  new LinkedList<Integer>();
        
        int i1 = 0, i2 = 0;
        
        while (i1 < l1.size() || i2 < l2.size() ) {
            if (i1 < l1.size() && i2 < l2.size()) 
                result.add(l1.get(i1) < l2.get(i2) ? l1.get(i1++): l2.get(i2++));
            else if (i1 < l1.size() && i2 >= l2.size())
                result.add(l1.get(i1++));
            else if (i1 >= l1.size() && i2 < l2.size())
                result.add(l2.get(i2++));
        }

        return result;
    }
    public static void main(String[] args) {
        Integer[] array1  = {10,20,30,40,50,60};
        Integer[] array2  = {15,25,35,45,55,65};
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        for(int i : array1)
            l1.add(i);
        for (int i : array2)
            l2.add(i);

        System.out.println("LL 1: " + l1);
        System.out.println("LL 2: " + l2);
        System.out.println("Merging them");
        System.out.println("Merged list:" + merge(l1, l2));
    }
    
}