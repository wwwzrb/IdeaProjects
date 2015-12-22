package People;

/**
 * Created by wcy on 2015/12/10.
 */
public class BeijingPeople extends ChinaPeople {
    public void averageHeight(){
        height=172.5;
        System.out.println("北京人的平均身高："+height+"厘米");
    }
    public void averageWeight(){
        weight=70;
        System.out.println("北京人的平均体重"+weight+"千克");
    }
    public void beijingopera(){
        System.out.println("花脸、青衣、花旦和老生");
    }
}