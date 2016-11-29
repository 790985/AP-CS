
/**
 * Write a description of class Students here.
 * 
 * @author (Chris Campos) 
 * @version (a version number or a date)
 */
public class Students
{
    // instance variables - replace the example below with your own
    private int ID;
    private double GPA;
    private String fName;
    private String mName;
    private String lName;
    /*
     * Constructor for objects of class Students
     */
    public Students(int Id, double Gpa, String fN, String mN, String lN){
        ID = Id;
        GPA = Gpa;
        fName = fN;
        mName = mN;
        lName = lN;
    }
    public void setID(int id)
    {
        ID = id;
    }
    public void setGPA(double gpa)
    {
        GPA = gpa;
    }
    public void setfName(String first)
    {
        fName = first;
    }public void setmName(String middle) 
    {
        mName = middle;
    }
    public void setLName(String last) 
    {
        lName = last;
    }
    public int getID()
    {
        return ID;
    }
    public double getGPA()
    {
        return GPA;
    }
    public String getFName()
    {
        return fName;
    }
    public String getMName() 
    {
        return mName;
    }
    public String getLName()
    {
        return lName;
    }
}