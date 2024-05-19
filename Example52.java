import java.util.*;
public class Example52 {

    static Scanner console = new Scanner(System.in); 
    public static void main(String[] args) {
       
        System.out.print(" enter first string:");
        String str1 = console.next();
        System.out.print("enter second string");
        String str2 = console.next();
        if(str1.compareTo(str2) == 0)
            System.out.println("the two strings are equel.");
        if(str1.compareTo(str2) < 0)
            System.out.println("the string str1 < string str2");
        if(str1.compareTo(str2) > 0)
            System.out.println("the string str1 > string str2");
            System.out.println("nazanin ho");
    }
    
}
