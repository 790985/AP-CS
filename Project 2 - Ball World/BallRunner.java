
/**
 * Write a description of class BallRunner here.
 * 
 * @author (Chris) 
 * @version (a version number or a date)
 */
public class BallRunner
{
   public void run(){
    BallWorld map = new BallWorld(1000,1000);
    BallBot[] list = new BallBot[10000];
    for(int num = 0; num < 10000; num++){
    TGPoint point = new TGPoint(Math.random()*10*num,Math.random()*10*num);
    list[num] = new BallBot(map,point,90.0*Math.random(),10);
    list[num].setPixelsPerSecond(10000);
}
   int x = 0;
   while(x < 500){
    for(int b = 0; b < 10000; b++){
    if(list[b].canMoveForward(map)){
        list[b].moveForward();
    }else{
    double h = list[b].getHeading();
    list[b].setHeading(360.0*Math.random());
    }
    }
    }
}}