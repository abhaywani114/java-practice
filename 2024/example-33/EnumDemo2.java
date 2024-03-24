enum Apple {
    GoldenDel(9), RedDel(12), Winsap(10);
    private int price;
    Apple(int price) {
        this.price = price;
    }
    int getPrice() {
        return price;
    }
}
public class EnumDemo2 {

    public static void main(String[] args) {
        System.out.println("Exploring Apple");
        for(Apple a : Apple.values()) {
            System.out.println(a + " costs " + a.getPrice() + "USD");
        }
    }
    
}