import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        String dup="Hello how are you";
        char[] ch=dup.toCharArray();
        Set<Character> charset=new LinkedHashSet<>();
        for(char c:ch)
        {
            charset.add(c);
        }
        System.out.println(charset);
    }
}
