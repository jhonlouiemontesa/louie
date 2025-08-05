package activity1;

import java.util.Scanner;


public class Activity1 {

  
    public static void main(String[] args) {
   
        
        public static void main(String[] args) {
            
            
            
        }
        try (Scanner scanner = new Scanner(System.in)) {
            String name;
            int math, science, history, socialstudies, total;
            float percentage;
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter mark in Math: ");
            math = scanner.nextInt();
            System.out.print("Enter mark in Science: ");
            science = scanner.nextInt();
            System.out.print("Enter mark in History: ");
            history = scanner.nextInt();
            System.out.print("Enter mark in Social Studies: ");
            socialstudies = scanner.nextInt();
            total = math + science + history + socialstudies;
            percentage = (float) total / 4;
            System.out.println("\nTotal Marks: " + total);
            System.out.println("Percentage: " + percentage);
            if (percentage >= 40) {
                System.out.println("Status: Passed");
                System.out.println("\nCongrats " + name + "!");
            } else {
                System.out.println("Status: Failed");
                System.out.println("\nSorry " + name + ".");
            }
        }
    }
}


    
    

