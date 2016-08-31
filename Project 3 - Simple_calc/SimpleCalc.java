
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class SimpleCalc
{
    private int a;
    private int b;
    public void SimpleCalc(){
    a = 5;
    b = 6;
    }
    public void SimpleCalc(int c,int d){
    a = c;
    b = d;
    }
    public int add(int a, int b){
    return a + b;
    }
    public int subtract(int a, int b){
    return a - b;
    }
    public int mult(int a, int b){
    return a * b;
    }
    public double div(int a, int b){
    return a / b;
    }
    public boolean isGreater(int a, int b){
    if(a > b){
    return true;
    }else{
    return false;
    }
    }
}
