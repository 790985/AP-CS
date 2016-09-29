
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
    Array.sort(nums)
    }
    public int getRange(int[][] nums){
        int large ;
        int small = 100;
       for(int i = 0; i < nums.length-1; i++){
       for(int h = 0; h < nums[i].length-1; i++){
           if(nums[i][h] > large){
           large = nums[i][h];
           }if(nums[i][h] < small){
           small = nums[i][h];
           }
       }}
        
        }
        return -1;
    }
    
    }

