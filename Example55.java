
public class Example55 {

    
    public static void main(String[] args) {
      StringBuffer str = new StringBuffer("Hello");
         System.out.println("str before calling the method :" + str);
      testMethod(str);
         System.out.println("str after calling the method :" + str);
    }
       public static void testMethod(StringBuffer pStr)
       {
           System.out.println(" in method: pStr " + "before changing its value: " + pStr);
       pStr.append("sunny day");
       System.out.println("in method : pStr " + "after changing its value: " + pStr);
       System.out.println("nazanin *_*");
       }
}
