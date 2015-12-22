package People;

/**
 * Created by wcy on 2015/12/10.
 */
public class AmericanPeople extends People {
    public void speakHello(){
        System.out.println("How do you do");
    }
    public void averageHeight(){
        height=176;
        System.out.println("American's average weight:"+height+"kg");
    }
    public void americanBoxing(){
        System.out.println("直拳、勾拳、组合拳");
    }
}
