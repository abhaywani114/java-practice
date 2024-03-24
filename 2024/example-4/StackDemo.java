class Stack {
  private int top = -1;
  private int size = 9;
  private int[] stack;

  Stack(int size) {
    this.size = size;
    this.stack = new int[this.size];
    System.out.println("Stack has been initialized");
  }

  int top() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return top;
    }
    return stack[top];
  }

  void push(int x) {
    if (top >= size - 1)
      System.out.println("Stack is full");
    else
      stack[++top] = x;
  }

  int pop() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return top;
    }
    return stack[top--];
  }

  void print(String s1) {
    System.out.println(s1);
  }
}

class StackDemo {
  public static void main(String[] argv) {
    Stack s1 = new Stack(2);
    s1.print("Top element is: " + s1.top());

    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.print("Top element is: " + s1.top());

    s1.print("Pop element is: " + s1.pop());
    s1.print("Top element is: " + s1.top());
  }
}