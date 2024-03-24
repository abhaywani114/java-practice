import java.util.LinkedList;
import java.util.ListIterator;
class LinkedListDemo3 {
    public static  LinkedList<Integer> merge( LinkedList<Integer> l1,  LinkedList<Integer> l2) {
        LinkedList<Integer> result =  new LinkedList<Integer>();
        ListIterator<Integer> itr1, itr2;
        itr1 = l1.listIterator();
        itr2 = l2.listIterator();
        while (itr1.hasNext() || itr2.hasNext()) {
            if (itr1.hasNext() && itr2.hasNext()) {
                Integer i1 = itr1.next();
                Integer i2 = itr2.next();
                if (i1 > i2) {
                    result.add(i2);
                    itr1.previous();
                } else {
                    result.add(i1);
                    itr2.previous();
                }
            }
            else if (itr1.hasNext() && !itr2.hasNext())
                result.add(itr1.next());
            else if (!itr1.hasNext() && itr2.hasNext())
                result.add(itr2.next());
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