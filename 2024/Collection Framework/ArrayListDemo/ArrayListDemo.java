import java.util.ArrayList;
import java.util.Collection;

class RemoveEvenNumber {
    int[] arr;
    Collection<Integer>  processedList;
    RemoveEvenNumber(int[] arr) {
        this.arr = arr;
        this.processedList = new ArrayList<Integer>();
        process();
    }
    void process() {
        for(int  e : arr)
            if (e % 2 != 0 )
                processedList.add(e);
    }
    Integer[] getArray() {
        Integer[] output = new Integer[this.processedList.size()];
        output = this.processedList.toArray(output) ;
        return output;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = {1,20,3,5,10,20,30};
        RemoveEvenNumber obj =  new RemoveEvenNumber(arr);
        System.out.println("Orginal array: " + arr);
        System.out.println("Process list: " + obj.processedList);
        System.out.println("Process as an array: " + obj.getArray());
    }
    
}