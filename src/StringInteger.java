
import java.util.Scanner;

public class StringInteger {
    public static void convertToInteger(String str) {
        System.out.println("Input: " + str);
        System.out.print("Converted: ");
        try {
            for (int i = 0; i < str.length(); i++) {
                int asciiValue = (int) str.charAt(i);
                System.out.print(asciiValue + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        convertToInteger(userInput);
        scanner.close();
    }
}
