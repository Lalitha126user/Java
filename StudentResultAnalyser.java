import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 1. Ask for the student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // 2. Ask for marks in 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        double marks1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double marks2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double marks3 = scanner.nextDouble();

        // 3. Calculate total marks
        double totalMarks = marks1 + marks2 + marks3;

        // 4. Calculate average marks
        double averageMarks = totalMarks / 3.0;

        // 5. Check whether the student passed (Assuming passing marks >= 40 for each subject)
        boolean isPassed = (marks1 >= 40) && (marks2 >= 40) && (marks3 >= 40);

        // 6. Check whether the student got distinction (Assuming average >= 75 and passed)
        boolean isDistinction = isPassed && (averageMarks >= 75);

        // 7. Check whether the student deserves a special award (e.g., perfect score in any subject or 95+ average)
        boolean deservesAward = (averageMarks >= 95) || (marks1 == 100 || marks2 == 100 || marks3 == 100);

        // 8. Display the final result
        System.out.println("\n----- Final Result -----");
        System.out.println("Student Name: " + name);
        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Average Marks: %.2f\n", averageMarks);
        
        if (isPassed) {
            System.out.println("Status: PASSED");
            if (isDistinction) {
                System.out.println("Achievement: DISTINCTION!");
            }
            if (deservesAward) {
                System.out.println("Award: Congratulation! Deserves a Special Award.");
            }
        } else {
            System.out.println("Status: FAILED");
        }
        
        scanner.close();
    }
}