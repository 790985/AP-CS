
/**
 * Write a description of class StudentList here.
 * 
 * @author (your name) 
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
        students.remove(index);
    }
    public static void printStudents(){
        for (int i = 0; i < students.size(); i++){
        System.out.println("ID: " + students.get(i).getID());
        System.out.println("Name: " + students.get(i).getName());
        System.out.println("GPA: " + students.get(i).getGPA());
        }
    }
    public static int menuNumber(){
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Print Students");
        System.out.println("4: Quit");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
        
    }
}