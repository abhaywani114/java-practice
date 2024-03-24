class Overload {
   void demo() {
    System.out.println("Function with no arguments overloaded");
   }
   void demo(int x) {
    System.out.println("One argv demo method");
    System.out.println("x=" + x);
  }
  void demo(int x, int y) {
    System.out.println("Two argv demo method");
    System.out.println("x=" + x);
    System.out.println("y=" + y);
  }
}
class OverloadDemo {
  public static void main(String[] argv) {
    Overload d1 = new Overload();
    d1.demo();
    d1.demo(2);
    d1.demo(2,3);
  }
}