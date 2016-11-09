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
    if(menuNumber() == 1){
        System.out.println("What is your students name?: ");
        name = sc.next();
        System.out.println("What is your students ID Number?: ");
        id = sc.nextInt();
        System.out.println("What is your students GPA?: ");
        gpa = sc.nextInt();
        addStudent(new Students(name,id,gpa));
    }
    
}
   }
}