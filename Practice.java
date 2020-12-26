import java.lang.reflect.Array;
import java.util.*;

public class Practice {



    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        int n=3;
      //  System.out.println("Enter max count series");
      //  fibonacci(in.nextInt());
       // String str=in.next();
       // palindrome(str);
      //  int n=in.nextInt();
        //System.out.println(factorial(n));
       //   removeDuplicates();
        //dupinString();
        //insertionSort();
       // bubblesort();
       // mergesort();
       // whitespace();
          factorial1(5);

    }

    private static void whitespace() {
        String str="i love you";

        str=str.replaceAll("\\s","");
        System.out.println(str);
    }

    private static void mergesort() {

        int[] u1={1,3,5,7};
        int[] u2={2,4,6,8};

        int[] u3=new int[u1.length+u2.length];
        int i=0,j=0,k;
        for(k=0;k<u3.length && i<u1.length && j<u2.length;k++)
        {
            if(u1[i]<u2[j])
            {
                u3[k]=u1[i];
                ++i;
            }
            else
            {
                u3[k]=u2[j];
                ++j;
            }

        }
        while(i<u1.length)
        {
            u3[k]=u1[i];
            ++k;
            ++i;
        }
        while(j<u2.length)
        {
            u3[k]=u2[j];
            ++k;
            ++j;
        }
        System.out.println(Arrays.toString(u3));

    }

    private static void bubblesort() {
        int[] uArray={34,12,65,44,54,23,4,11};
        int temp;
        for(int i=1;i<uArray.length;i++)
        {
            for(int j=0;j<uArray.length-i;j++)
            {
                if(uArray[j]<uArray[j+1])
                {
                   temp=uArray[j];
                   uArray[j]=uArray[j+1];
                   uArray[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(uArray));

    }

    private static void insertionSort() {

        int[] uArray={34,12,65,44,54,23,4,11};
        int current,j;
        System.out.println(Arrays.toString(uArray));
        for(int i=1;i<uArray.length;i++) {
            current = uArray[i];
            j=i;
            while(j>0 && uArray[j-1]>current )
            {
                uArray[j]=uArray[j-1];
                j--;
            }
            uArray[j]=current;

        }
        System.out.println(Arrays.toString(uArray));
    }

    private static void dupinString() {

        String str="shubam";
        char[] ch=str.toCharArray();
        Set<Character> m=new LinkedHashSet<>();
        Map<Character,Integer> charmap=new HashMap<>();

        for(char c:ch)
        {
            m.add(c);
            if(charmap.containsKey(c))
            {
                charmap.put(c,charmap.get(c)+1);
            }
            else
            {
                charmap.put(c,1);
            }
        }
        Set<Character> l= charmap.keySet();
        List<Character> p=new ArrayList<>(m);

        for(Character ch1:m)
        {
            if(charmap.get(ch1)>1)
            {
                System.out.println(ch1+":"+charmap.get(ch1));
            }
            else
            {
                System.out.println(ch1+":"+charmap.get(ch1));
            }
        }

    }

    private static void removeDuplicates() {

        List<Integer> dup=new ArrayList<>();
        dup.add(2);
        dup.add(3);
        dup.add(4);
        dup.add(3);
        System.out.println(dup.toString());
        Set<Integer> wdup=new LinkedHashSet<>();
        wdup.addAll(dup);
        dup.clear();
        dup.addAll(wdup);

        System.out.println(dup);


    }
    private static void factorial1(int n) {

        if(n==1 || n==0) {
            System.out.print(1);
            return;
        }
        System.out.print(n+"*");
        factorial1(n-1);


    }
    private static int factorial(int n) {

        if(n==1 || n==0)
            return 1;

        return n*factorial(n-1);


    }

    private static void palindrome(String str) {
        char[] str2=str.toCharArray();
        int n=str.length()-1;
        for(char i:str2)
        {
            if(i!=str2[n--])
            {
                System.out.println("false");
            }
        }
        System.out.println("True");


    }

    private static void fibonacci(int no) {
        int temp=0,temp1=1,temp2;
        System.out.println(1);

        for(int i=1;i<no;i++)
        {

            temp2=temp+temp1;
            System.out.println(temp2);
            temp=temp1;
            temp1=temp2;


        }
    }
}