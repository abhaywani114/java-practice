import java.util.Scanner;
public class findSeason {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = keyboard.nextInt();
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("The season is Winter");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("The season is Spring");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("The season is Summer");
        } else if (month == 10 || month == 11 || month == 12) {
            System.out.println("The season is Autumn");
        } else {
            System.out.println("Invalid month");
        }        
    }
}
