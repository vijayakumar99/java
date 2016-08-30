import java.util.*;
import java.io.*;
class xxx
{
   
  void isIsomorphic() 
  {
     String s;
     String t;
     Scanner scan=new Scanner(System.in);
     s=scan.next();
     t=scan.next();
     s= s.toLowerCase();
     t = t.toLowerCase();
     if(s.length()!=t.length())
     {
        System.out.println("False");
    }
    if(s.equalsIgnoreCase(t)){
        System.out.println("True");
    }
    HashMap<Character,Integer> mapOfFirst = new HashMap<Character,Integer>();
    HashMap<Character,Integer> mapOfSec = new HashMap<Character,Integer>();
    int cnt1 =0 ;
    int cnt2 =0 ;
    for(int i =0;i<s.length();i++){

        if(mapOfFirst.get(s.toCharArray()[i])!=null){

        }
        else{
            mapOfFirst.put(s.toCharArray()[i],cnt1);
            cnt1 = cnt1+1;
        }

    }
    for(int i =0;i<t.length();i++){

        if(mapOfSec.get(t.toCharArray()[i])!=null){

        }
        else{
            mapOfSec.put(t.toCharArray()[i],cnt2);
            cnt2 = cnt2+1;
        }

    }

    char[] sCharArray_Fir = s.toCharArray();
    char[] sCharArray_Sec= t.toCharArray();

    for(int i = 0 ; i< s.length();i++){
        int ch1 = mapOfFirst.get(sCharArray_Fir[i]);
        int ch2 = mapOfSec.get(sCharArray_Sec[i]);
        if(ch1!=ch2)
        {
            
            System.out.println("False");
            
        }
    }
    System.out.println("True");
   
}   
   public static void main(String args[])
   {
	  
	  Scanner scan=new Scanner(System.in);
      Iss s=new Iss();
      s.isIsomorphic();
      
   }
}
