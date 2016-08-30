import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class prob {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in); // use the Scanner class to read from stdin
    
       String s1=s.next();
       int n=s1.length();
       int k=s.nextInt(); 
      int a[]=new int[n];
       for(int i=0;i<n;i++)
           {
           a[i]=s1.charAt(i)-48;
       }
       Arrays.sort(a);
       for(int i=0;i<n-k;i++)
           System.out.print(a[i]);
   }
}
