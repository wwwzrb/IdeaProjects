package SunRise;

/**
 * Created by wcy on 2015/12/10.
 */
import SquareEquation.SquareEquation;
public class SunRise {
    public static void main(String args[]){
        SquareEquation equation=new SquareEquation(4,5,1);
        equation.getRoots();
        equation.setCoefficient(-3,4,5);
        equation.getRoots();
    }
}

