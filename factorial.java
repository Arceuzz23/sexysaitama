import java.util.*;
public class factorial {
    public static int factoriala(int n)

    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=factoriala(n);
        System.out.println(f1);
        sc.close();


    }
}
