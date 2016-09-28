
/**
 * Write a description of class Statlab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Statlab
{
    public void loadArray(int[][] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; i < nums[0].length; j++){
            nums[i][j] = (int) Math.random() * 21;
            }
        } 
    
    }
    public void printarray(int[][] nums){
        System.out.println(nums);
    }
    public void sortarray(int[][] nums){
    for (int i = 0; i < nums.length; i++){
            for (int j = 0; i < nums[0].length; j++){
            if (nums[i][j] > nums[i+1][j+1]){
            nums[i][j] = nums[j][i];
            }
            }
        }}
    public int getRange(int[][] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; i < nums[0].length; j++){
            if (nums[i][j] < nums[j][i]){
            return j;
            }
            }
        
        }
        return -1;
    }
    
    }

