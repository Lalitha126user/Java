import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

        scanner.close();
    }
}
