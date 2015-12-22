package Mission1_1;

/**
 * Created by wcy on 2015/12/4.
 */
public class JudgePrime {
    boolean Prime(int y,int [] q){
        int i,a;
        a=(int)Math.sqrt((double)y);
        for(i=0;i<a;i++)
            if(y%q[i]==0)
                break;
        if(i!=a&&y!=2)
            return false;
        else
            return true;
    }
}
