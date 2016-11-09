
/**
 * Write a description of class Students here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Students
{
    // instance variables - replace the example below with your own
    private int stuID;
    private double stuGPA;
    private String stuName;
    /**
     * Constructor for objects of class Students
     */
    public Students(int ID, double GPA, String name)
    {
        stuID = ID;
        stuGPA = GPA;
        stuName = name;
    }

    public int getID()
    {
       return stuID;
    }
    public double getGPA(){
        return stuGPA;
    }
    public String getName(){
        return stuName;
    }
}
