package Vheicle;

/**
 * Created by wcy on 2015/12/3.
 */
public class Vehicle {
    double speed;
    int power;
    void speedUp(int s){
        speed=s+speed;
    }
    void speedDown(int d){
        speed=speed-d;
    }
    void setPower(int p){
        power=p;
    }
    int getPower(){
        return power;
    }
    double getSpeed(){
        return speed;
    }
}
