import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            String word = scanner.nextLine();
            int Counter = 0;

            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                if ("aeiou".indexOf(character) != -1) {
                    Counter++;
                }
            }
            System.out.println("No.of Vowels in the given string are: " + Counter);
            scanner.close();
        }
    }
}
