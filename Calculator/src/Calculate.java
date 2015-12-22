
import java.util.EmptyStackException;
import java.util.Stack;

public class Calculate{
    private static String[] TrnsInToSufix(String IFX)// PFX放后缀表达式，IFX为中缀表达式
    {
        String PFX[] = new String[IFX.length()+1];
        StringBuffer numBuffer = new StringBuffer();// 用来保存一个数的
        Stack<String> s = new Stack<String>();// 放操作符
        String a;
        s.push("=");// 第一个为等号
        int i = 0, j = 0;
        char ch;
        for (i = 0; i < IFX.length();) {
            ch = IFX.charAt(i);
            switch (ch) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    while (Character.isDigit(ch) || ch == '.')// 拼数
                    {
                        numBuffer.append(ch); // 追加字符
                        if(i==IFX.length()-1){
                            i++;
                            break;
                        }
                        ch = IFX.charAt(++i);
                    }
                    PFX[j++] = numBuffer.toString();// break;
                    numBuffer = new StringBuffer(); // 清空已获取的运算数字
                    continue; // 这里要重新循环，因为i已经增加过了
                case '(':
                    s.push("(");
                    break;
                case ')':
                    while (s.peek() != "(")
                        PFX[j++] = s.pop();
                    break;
                case '+':
                case '-':
                    while (s.size() > 1 && s.peek() != "(")
                        PFX[j++] = s.pop();
                    a = String.valueOf(ch);
                    s.push(a);
                    break;
                case '*':
                case '/':
                    System.out.println(s.peek());
                    while (s.size() > 1&&(s.peek().equals("/")||s.peek().equals("*"))){
                            PFX[j++] = s.pop();// 优先级比较，与栈顶比较，
                    }
                    a = String.valueOf(ch);
                    s.push(a);
                    break;
            }
            i++;
        }
        while (s.size() > 1)
            PFX[j++] = s.pop();
        PFX[j] = "=";
        for(i=0;i<j+1;i++)
            System.out.printf(PFX[i]);

        return PFX;
    }

    public static String Evaluate(String IFX)// 后缀表达式求值
    {
        String PFX[] = null;
        try {
            PFX = TrnsInToSufix(IFX);
        } catch (EmptyStackException e) {
            return "syntax error";
        }
        int i = 0;
        double x1, x2, n;
        String str;
        Stack<String> s = new Stack<String>();
        while (PFX[i] != "=") {
            str = PFX[i];
            switch (str.charAt(0)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    s.push(str);
                    break;
                case '+':
                    x1 = Double.parseDouble(s.pop());
                    x2 = Double.parseDouble(s.pop());
                    n = x1 + x2;
                    s.push(String.valueOf(n));
                    break;
                case '-':
                    x1 = Double.parseDouble(s.pop());
                    x2 = Double.parseDouble(s.pop());
                    n = x2 - x1;
                    s.push(String.valueOf(n));
                    break;
                case '*':
                    x1 = Double.parseDouble(s.pop());
                    x2 = Double.parseDouble(s.pop());
                    n = x1 * x2;
                    s.push(String.valueOf(n));
                    break;
                case '/':
                    x1 = Double.parseDouble(s.pop());
                    x2 = Double.parseDouble(s.pop());
                    n = x2 / x1;
                    s.push(String.valueOf(n));
                    break;
            }
            i++;
        }
        String result = s.pop();
        return result;
    }
}