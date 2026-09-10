import java.util.Scanner;

public class NameCollector {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
       
        String[] names = new String[5];
        
        
        System.out.println("Please enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scn.nextLine(); 
        }
        
        
        System.out.println("\nThe 5 names you entered are:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        
        
        scn.close();
    }
}