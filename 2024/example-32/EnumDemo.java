enum Status {
    PENDING,
    ACTIVE,
    BLOCKED
}
public class EnumDemo {
    public static void main(String[] args) {
        Status User1 = Status.ACTIVE;

        switch (User1) {
            case ACTIVE:
                System.out.println("User is Active");
                break;
            case PENDING:
                System.out.println("User is pending");
                break;
            case BLOCKED:
                System.out.println("User is blocked");
                break;
        }
    }
    
}