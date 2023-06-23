
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);

        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();


      //  GenericPrinter person=(ptr) -> System.out.println(ptr.toString);
      //  personLambda.print(Person);

    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toUpperCase();
        System.out.println("changed string  "+str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println(" the string contains");
        return count ;
    }
}
