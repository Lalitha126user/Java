import java.util.Scanner;
class Student1{
    String name;
    int age,marks,roll_no;
    void get_details(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter yr name : ");
        name=scn.nextLine();
        System.out.println("enter roll_no : ");
        roll_no=scn.nextInt();
        System.out.println("enter yr age : ");
        age=scn.nextInt();
        System.out.println("enter yr marks : ");
        marks=scn.nextInt();
    }
    void display_details(){
        System.out.println("***printing details***");
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Roll_no="+roll_no);
        System.out.println("Marks="+marks); 
    }
}
public class Student1{
    public static void main(String[] args){
        Student1 s1=new Student1();
        s1.get_details();
        s1.display_details();
    }
}