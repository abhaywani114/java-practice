/*
  HCF - Heighest Common factor
  - Two number
  - Find: that can divide botj number
  - Approach: 10 - 1, 2, 3, 4, 5, ... 10, Can 11 divide 10?
  - 11- 1, 2, ... 11,
  - a and b
  - loop until a or b (index i)
  - i = 1 : check if a can be dvided by i, and if b can be divided by i => Comman factor
  - else contine i++
  - x1, x2, x3 -> max
  - 10, 20?
 */
import java.util.Scanner;
class findHcf {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number_1 = keyboard.nextInt();
        System.out.println("Enter second number: ");
        int number_2 = keyboard.nextInt();
        int hcf = 1;
        for(int i = 1; i < number_1 || i < number_2; i++) {
            if (number_1 % i == 0 && number_2  % i == 0)
                hcf = i;
        }
        System.out.println("The hcf given numbers is: " +  hcf);
    }
}