
package activity1;

public class activity2 {
    
    public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        
        if (number1 == 0) {
            System.out.println("Inputted number Zero");
        } else if (number1 % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
        
        System.out.println();
        
        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        
        if (number2 == 0) {
            System.out.println("Inputted number Zero");
        } else if (number2 % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
        System.out.println();
        
        System.out.print("Enter a number: ");
        int number3 = scanner.nextInt();
        
        if (number3 == 0) {
            System.out.println("Inputted number Zero");
        } else if (number3 % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
        scanner.close();
    }
}

    
}