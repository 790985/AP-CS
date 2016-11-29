
/**
 * Write a description of class StudentList here.
 * 
 * @author (Chris) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class StudentList
{
    static ArrayList<Students> students = new ArrayList<Students>();
    public static void addStudent(Students s, int index)
    {   
        students.add(index, s);                
    }   
    public static void delStudent(int index){
    try{
        students.remove(index);
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("That student does not exist");
    } 
    }
    public static void printStudent(Students stu){
    System.out.println("ID: " + stu.getID());
    System.out.println("Name: " + stu.getFName()+ " "+ stu.getMName()+ " " + stu.getLName());
    System.out.println("GPA: " + stu.getGPA());
    }
    public static void printStudents(){
        for (int i = 0; i < students.size(); i++){
        System.out.println("ID: " + students.get(i).getID());
        System.out.print("Name: " + students.get(i).getFName()+ " "+ students.get(i).getMName()+ " " + students.get(i).getLName());
        System.out.print("GPA: " + students.get(i).getGPA());
        }
    }
    public static int menuNumber(){
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Print Students");
        System.out.println("4: Filter GPA");
        System.out.println("5: Filter ID");
        System.out.println("6: End Session");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
        
    }
    public static void getFilterGpa(double Gpa){
        int counter = 0;
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getGPA() < Gpa){
            printStudent(students.get(i));
            counter++;
        }
        }
        if(counter <= 0){
        System.out.println("No students found with that filter. Try Again.");
        }
    }
    public static void getFilterStuID(int ID){
        int counter = 0;
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getID() < ID){
            printStudent(students.get(i));
            counter++;
        }
        }
        if(counter <= 0){
        System.out.println("No students found with that filter. Try Again.");
        }
    }
}