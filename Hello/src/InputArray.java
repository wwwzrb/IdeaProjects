/**
 * Created by wcy on 2015/11/28.
 */
public class InputArray {
    public static void main (String args[]){
        int [] a = {100,200,300};
        System.out.println("数组a的元素个数="+a.length);
        System.out.println("数组a的引用="+a);
        int b[][]={{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        System.out.println("二维数组b的一维数组个数="+b.length);
        System.out.println(b[4][2]);
        b[4]=a;
        System.out.println(b[4][2]);
    }
}
