public class Hello {
   public static void main (String args[]) {
      System.out.println("你好，欢迎学习JAVA");
     // System.out.println("Nice to meet you");
      Student stu=new Student();
      stu.speak("We are students");
   }
}
class Student {
   public void speak(String s) {
      System.out.println(s);
   }
}
