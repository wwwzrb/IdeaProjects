package Mission1_1; /**
 * Created by wcy on 2015/12/4.
 */
import java.util.Scanner;
public class Mission1_1 {
    public static void main(String args[]){
        int i,x=1;
        int n;
        int [] p;
        p=new int[1000];
        Scanner reader=new Scanner(System.in);
        JudgePrime Judge=new JudgePrime();
        System.out.println("打印前N个素数，请输入N:");
        n=reader.nextInt();
        System.out.println("打印素数：");
        p[0]=2;
        for(i=0;i<n;i++)
        {
            do{
                x++;
            }while(!Judge.Prime(x,p));
            if(i%10==0)
                System.out.println();
            p[i]=x;
            System.out.printf("% 4d",x);
        }
    }
}

