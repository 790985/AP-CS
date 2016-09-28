
/**
 * Write a description of class Statlabrunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Statlabrunner
{
    public static void main(String[] args){
    Statlab sl = new Statlab();
    int[][] s = new int[10][10];
    sl.loadArray(s);
    sl.printarray(s);
    sl.sortarray(s);
    sl.getRange(s);
    
    }
}
