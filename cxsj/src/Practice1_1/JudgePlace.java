package Practice1_1;

/**
 * Created by wcy on 2015/12/6.
 */
public class JudgePlace {
    boolean Place(int m,int [] y){
        for(int j=1;j<m;j++)
            if((Math.abs(m-j)==Math.abs(y[m]-y[j]))||(y[j]==y[m]))
                return false;
        return true;
    }
}
