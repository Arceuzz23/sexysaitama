import java.util.*;
public class gcd {

    public static int gcda(int a , int b)

    {
        int i,hcf=0,k=a;
        if(a>b)
        for(i=0;i<a;i++)
        {
            if(k>=b)
            hcf=k%b;
            else
            hcf=b%k;
            k=hcf;
         }
        return hcf;
    }
                                                
        

    
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int hcf=gcda(a,b);
        System.out.println("the hcf is = "+hcf);
        sc.close();


    }
    
}
