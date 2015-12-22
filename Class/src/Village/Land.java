package Village;

/**
 * Created by wcy on 2015/12/10.
 */
public class Land {
    public static void main(String args[]){
        Village.setWaterAmount(200);
        int leftWater=Village.waterAmount;
        System.out.println("水井中有"+leftWater+"升水");
        Village zhaoZhuang;
        Village maJiaHeZhi;
        zhaoZhuang=new Village("赵庄");
        maJiaHeZhi=new Village("马家河子");
        zhaoZhuang.setPeopleNumber(80);
        maJiaHeZhi.setPeopleNumber(120);
        zhaoZhuang.drinkWater(50);
        leftWater=maJiaHeZhi.lookWaterAmount();
        String name=maJiaHeZhi.name;
        System.out.println(name+"发现水井中有"+leftWater+"升水");
        maJiaHeZhi.drinkWater(100);
        leftWater=zhaoZhuang.lookWaterAmount();
        name=zhaoZhuang.name;
        System.out.println(name+"发现水井中有"+leftWater+"升水");
        int peopleNumber = zhaoZhuang.getPeopleNumber();
        System.out.println("赵庄的人口:"+peopleNumber);
        peopleNumber = maJiaHeZhi.getPeopleNumber();
        System.out.println("马家河子的人口:"+peopleNumber);
    }
}
