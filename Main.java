import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lets start with first number
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask for the first number
            System.out.println("First number?");
            int num1 = scanner.nextInt();
            
            // Ask for the second number
            System.out.println("Second number?");
            int num2 = scanner.nextInt();
            
            // Print the formula
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}
