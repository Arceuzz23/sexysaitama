import java.util.*;
public class bubblesort {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("enter elements of array");
        for(i=0;i<n;i++)        
        a[i]=sc.nextInt();
        System.out.println("enter order of array in which you have to sort");
        String op=sc.next();
        if(op.compareTo("increasing")==0)
        {
            for(i=0;i<n;i++)
            {                            
            for(j=0;j<n-i-1;j++)
            {                 
            if(a[j]>a[j+1])
            {
                int t=a[j+1];
                a[j+1]=a[j];
                a[j]=t;
                

            }

            }
            
        }            
        for(i=0;i<=n-1;i++)
            System.out.println(a[i]);
        }

    
    if(op.compareTo("decreasing")==0)
        {
            for(i=0;i<n;i++)
            {                            
            for(j=0;j<n-i-1;j++)
            {                     
            if(a[j]<a[j+1])
            {
                int t=a[j+1];
                a[j+1]=a[j];
                a[j]=t;
                

            }

            }
            
        }            
        for(i=0;i<=n-1;i++)
            System.out.println(a[i]);
        }

    }
    
}
        