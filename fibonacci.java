import java.util.*;
public class fibonacci {
    public static void main (String args[])
    {Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a =1;int b=0;int i;int c=0;
        System.out.print(c+" ");
            System.out.print(a+" ");
        for(i=0;i<n;i++)
        {
            
            b=c+a;
            System.out.print(b+" ");
            c=a;
            a=b;
            sc.close();

        }
        

    }
    
}
