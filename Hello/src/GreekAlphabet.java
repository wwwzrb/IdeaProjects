package GreekAlphabet;

/**
 * Created by wcy on 2015/11/26.
 */
public class GreekAlphabet {
    public static void main (String args[]) {
        int SP = 0, EP = 0;
        char cStart = 'α', cEnd = 'ω';
        SP = (int) cStart;
        EP = (int) cEnd;
        System.out.println("希腊字母\'α\'在Unicode表中的顺序位置：" + SP);
        System.out.println("希腊字母\'ω\'在Unicode表中的顺序位置：" + EP);
        for (int i = SP; i <= EP; i++) {
            char c = '\0';
            c = (char) i;
            System.out.print(" " + c);
            if ((i - SP + 1) % 10 == 0)
                System.out.println("");
        }
    }
}

