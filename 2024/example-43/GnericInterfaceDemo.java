interface MinMax<T> {
    T min();
    T max();
}

class GnenericInterface <T extends Comparable<T> > implements MinMax<T> {
    T number1;
    T number2;
    GnenericInterface(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T min() {
        if (number1.compareTo(number2) < 0)
            return number1;
        else
            return number2;
    }

    public T max() {
        if (number1.compareTo(number2) > 0)
            return number1;
        else
            return number2;
    }

}
public class GnericInterfaceDemo {

  public static void main(String[] args) {
     GnenericInterface<Integer> obj = new GnenericInterface<Integer>(10,20);
     System.out.println("Min: " + obj.min());
     System.out.println("Max: " + obj.max());
  }  
}