package Mission1_2;

/**
 * Created by wcy on 2015/12/4.
 */
import java.util.Scanner;
public class Mission1_2 {
    public static void main(String args[]){
        int n,ih,il,i,k,min,a,b;
        int [] s,j,p;
        s=new int[1000];
        j=new int[1000];
        p=new int[1000];
        Scanner reader=new Scanner(System.in);
        System.out.println("对于这个表达式S=A^N+B^N=C^N+D^N,请输入其中的N：");
        n=reader.nextInt();
        i=1;ih=2;il=1;
        j[1]=1;p[1]=1;s[1]=2;
        j[2]=1;p[2]=(int)Math.pow(ih,n);s[2]=p[2]+1;
        do{
            min=s[i];a=i;b=j[i];
            if(j[i]==i)
                il=il+1;
            else {
                if (j[i] == 1) {
                    ih = ih + 1;
                    p[ih] = (int)Math.pow(ih,n);
                    j[ih] = 1;
                    s[ih] = p[ih] + 1;
                }
                j[i]=j[i]+1;s[i]=p[i]+p[j[i]];
            }
            i=il;k=i;
            while(k<ih){
                k=k+1;
                if(s[k]<s[i])
                    i=k;
                }
        }while(s[i]!=min);
        System.out.println("S="+min+"="+a+"^"+n+"+"+b+"^"+n+"="+i+"^"+n+"+"+j[i]+"^"+n);
    }
}
