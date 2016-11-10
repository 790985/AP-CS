import java.util.Scanner;
/**
 * Write a description of class ListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListRunner
{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    int gpa;
    public static void main(String[] args){
        while(menuNumber() != 4){
        int input = menuNumber();
    if(input == 1){
        System.out.println("What is your students name?: ");
        name = sc.next();
        System.out.println("What is your students ID Number?: ");
        id = sc.nextInt();
        System.out.println("What is your students GPA?: ");
        gpa = sc.nextInt();
        addStudent(new Students(name,id,gpa));
    }else if (input == 2) {
       System.out.println("What index is your student at (Start at 0): ");
       delStudent(sc.nextInt());
    }else if (input == 3) {
        printStudents();
    }else{
       System.out.println("We do not recognize what you have entered. Please enter a number from 1-4.");
   }
    
}
   }
}
