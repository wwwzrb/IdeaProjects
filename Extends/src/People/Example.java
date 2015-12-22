package People;

/**
 * Created by wcy on 2015/12/17.
 */
public class Example {
    public static void main(String args[]){
        ChinaPeople chinaPeople=new ChinaPeople();
        AmericanPeople americanPeople=new AmericanPeople();
        BeijingPeople beijingPeople=new BeijingPeople();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingopera();
        beijingPeople.chinaGongfu();
    }
}
