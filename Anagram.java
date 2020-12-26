import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Anagram {



    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println("IS Anaagram"+ anagram(str1,str2));
    }

    public static boolean anagram(String str1,String str2){

        char[] string1=str1.toCharArray();
        char[] string2=str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        System.out.println(string1);
        System.out.println(string2);

        int i=0;
       for(char c:string1)
       {
           if(c!=string2[i])
               return false;

           ++i;
       }
       return true;

    }

}
