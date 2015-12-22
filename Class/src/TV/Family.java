package TV;

/**
 * Created by wcy on 2015/12/3.
 */
public class Family {
    TV homeTV;
    void buyTV(TV tv){
        homeTV=tv;
    }
    void remoteControl(int m){
        homeTV.setChannel(m);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}
