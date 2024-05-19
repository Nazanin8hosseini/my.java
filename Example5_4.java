
public class Example5_4 {


    public static void main(String[] args) {
       System.out.println("**In the name of Nazanin**");
       String str = "Hello";
       System.out.println("str before calling the method:" + str);
       testMetod(str);
       System.out.println("str after calling the method:" + str);
    }
    public static void testMetod(String pStr){
        System.out.println("in method : pStr" + "before changing its value: " + pStr);
        pStr = "Sunny Day";
        System.out.println("in method : pStr" + "after changing its value: " + pStr);
        System.out.println("******");
    }
           
}
