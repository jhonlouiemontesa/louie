
package activity1;

import java.util.Scanner;


public class activity3 {
    
    public class NumCom {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1, num2;
            System.out.print("Enter value for num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter value for num2: ");
            num2 = scanner.nextInt();
            if (num1 > num2) {
                System.out.println("num1 is greater than num2");
            } else {
                if (num2 > num1);
                System.out.println("num2 is greater than num1");
            }   if (num2 == num1) {
                System.out.println("both have equal value");
            }
        }
    }
}


    
}
