import java.util.Scanner;
/**
 * Write a description of class ListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListRunner
{
   public ListRunner(){
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    int gpa;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        int gpa;
        int index;
            while(StudentList.menuNumber() != 4){
                if(StudentList.menuNumber() == 1){
        System.out.println("What is your students name?(First, Middle and Last): ");
        name = sc.next();
        System.out.println("What is your students ID Number?: ");
        id = sc.nextInt();
        System.out.println("What is your students GPA?: ");
        gpa = sc.nextInt();
        System.out.println("What index is your student at (Start at 0): ");
        index = sc.nextInt();
        StudentList.addStudent(new Students(id,gpa,name),index);
       }else if (StudentList.menuNumber() == 2) {
       System.out.println("What index is your student at (Start at 0): ");
       StudentList.delStudent(sc.nextInt());
       }else if (StudentList.menuNumber() == 3) {
        StudentList.printStudents();
       }else{
       System.out.println("We do not recognize what you have entered. Please enter a number from 1-4.");
       }
       } 
   }
}