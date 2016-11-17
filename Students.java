
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
    private String fName;
    private String mName;
    private String lName;
    private String stuName = fName + " " + mName + " " + lName;
    /*
     * Constructor for objects of class Students
     */
    public Students(int ID, double GPA, String fullName)
    {
        stuID = ID;
        stuGPA = GPA;
        if (fullName.indexOf(",") >= 0){
            fName = fullName.substring(fullName.indexOf(","))
            lName = fullName.substring(0,fullName.indexOf(",")-1)
    }else if()
        ;
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
