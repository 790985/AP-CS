import java.util.Scanner;
/**
 * Write a description of class ListRunner here.
 * 
 * @author (Chris Campos) 
 * @version (a version number or a date)
 */
public class ListRunner
{
   //public ListRunner(){
   // Scanner sc = new Scanner(System.in);
   // String name;
   // int id;
   // double gpa;
//}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fname;
        String mname;
        String lname;
        int id;
        double gpa;
        int index;
            while(StudentList.menuNumber() != 6){
                if(StudentList.menuNumber() == 1){
       try{
        System.out.println("What is your students name?(First, Middle and Last): ");
        fname = sc.next();
        mname = sc.next();
        lname = sc.next();
       }catch(java.util.InputMismatchException e){
       System.out.println("Please enter a name formated, First Middle Last");
       fname = sc.next();
       mname = sc.next();
       lname = sc.next(); 
        }
        try{
        System.out.println("What is your students ID Number?: ");
        id = sc.nextInt();
       }catch(java.util.InputMismatchException e){
        System.out.println("Please enter an int: ");
        id = sc.nextInt();
        
        
       }
       try{
        System.out.println("What is your students GPA?: ");
        gpa = sc.nextDouble();
       }catch(java.util.InputMismatchException e){
         System.out.println("Please enter a decimal number i.e. 2.0: ");
         gpa = sc.nextDouble();
        }
        System.out.println("What index is your student at (Start at 0): ");
        index = sc.nextInt();
        StudentList.addStudent(new Students(id,gpa,fname,mname,lname),index);
       }else if (StudentList.menuNumber() == 2) {
       System.out.println("What index is your student at (Start at 0): ");
       StudentList.delStudent(sc.nextInt());
       }else if (StudentList.menuNumber() == 3) {
        StudentList.printStudents();
       }else if (StudentList.menuNumber() == 4){
       System.out.println("What is your minimum gpa you would like to use to filter");
       StudentList.getFilterGpa(sc.nextDouble());
       }else if (StudentList.menuNumber() == 5){
       System.out.println("What is your minimum Student ID you would like to use to filter");
       StudentList.getFilterStuID(sc.nextInt());
        }else{
       System.out.println("We do not recognize what you have entered. Please enter a number from 1-4.");
       }
       } 
   }
}