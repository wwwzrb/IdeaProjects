package Practice1_1;

/**
 * Created by wcy on 2015/12/6.
 */
import java.util.Scanner;
public class Practice1_1 {
    public static void main(String args[]){
        int n,sum=0;
        int [] x;
        int s[][];
        x=new int[10];
        s=new int[100][10];
        Scanner reader=new Scanner(System.in);
        JudgePlace JP=new JudgePlace();
        System.out.println("请输入N皇后问题中的N（N<=8）：");
        n=reader.nextInt();
        for(int i=0;i<10;i++)
            x[i]=0;
        for(int i=0;i<100;i++)
            for(int j=0;j<10;j++)
                s[i][j]=0;
        x[1]=0;
        int k=1;
        while(k>0){
            x[k]+=1;
            while((x[k]<=n)&&!(JP.Place(k,x)))
                x[k]+=1;
            if(x[k]<=n)
                if(k==n)
                {
                    sum++;
                    for(int i=1;i<=n;i++)
                        s[sum][i]=x[i];
                }
                else
                {
                    k++;
                    x[k]=0;
                }
            else
                k--;
        }
        System.out.println("共有"+sum+"中方案");
        for(int j=1;j<=sum;j++)
        {
            System.out.println("方案"+j);
            for(int i=1;i<=n;i++)
            {
                for(int a=1;a<s[j][i];a++)
                    System.out.printf(0+" ");
                System.out.printf(1+" ");
                for(int a=s[j][i]+1;a<=n;a++)
                    System.out.printf(0+" ");
                System.out.println();
            }
        }
    }
}
