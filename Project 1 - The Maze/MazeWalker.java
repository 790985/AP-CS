
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public void walkMaze(MazeBot mazeBot){
        String dir = "None"
        while(!mazeBot.didReachGoal()){
        if(mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }else if(mazeBot.canMoveInDirection(-90.0)&&dir == ""){
            mazeBot.turnLeft();
            dir = "Left"
        }else if(mazeBot.canMoveInDirection(90.0)){
            mazeBot.turnRight();
            dir = "Right"
        }else if(mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
            break;
        }
    }
}}
