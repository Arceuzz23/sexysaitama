import java.util.*;
public class strreverse {
    public static void main (String args[])
    {Scanner sc= new Scanner(System.in);
        String s= sc.next();String s1=" ";
        int i;
        for(i=s.length()-1;i>=0;i--)
    {      
        s1=s1+s.charAt(i);

    }
    System.out.println("the reverse of the word is: "+s1);

    }
    
}
