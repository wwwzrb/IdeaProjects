package Village;

/**
 * Created by wcy on 2015/12/10.
 */
public class Village {
   static int waterAmount;  /*模拟水井的水量*/
    int peopleNumber;
    String name;
    Village(String s){
        name=s;
    }
    static void setWaterAmount(int m){
        if(m>0)
            waterAmount=m;
    }
    void drinkWater(int n){
        if(waterAmount-n>=0){
            waterAmount=waterAmount-n;
            System.out.println(name+"喝了"+n+"升水");
        }
        else
            waterAmount=0;
    }
    static int lookWaterAmount() {
        return waterAmount;
    }
    void setPeopleNumber(int n){
        peopleNumber=n;
    }
    int getPeopleNumber(){
        return peopleNumber;
    }
}
