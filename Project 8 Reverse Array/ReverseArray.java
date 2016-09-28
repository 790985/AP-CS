
/**
 * Write a description of class ReverseArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReverseArray
{
    public int[] revArray(int[] nums){
        int[] smun = new int[nums.length];
        
        for(int i = 0; i > nums.length-1; i++){
        smun[i] = nums[nums.length-i];
        }
        return smun;
    }
   
}
